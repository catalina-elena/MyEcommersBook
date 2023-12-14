package com.gt.bookApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RestController("/users/")
@RequestMapping
public class UserController {
    private  final UserService userService;
    @Autowired
    public UserController(UserService userServices) {
        this.userService=userServices;

    }

    @GetMapping("")
    public ResponseEntity<List<UserAccount>> getAllUsers() {
        List<UserAccount> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<UserAccount> getUserById(@PathVariable Integer id) {
        Optional<UserAccount> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/save/")
    public ResponseEntity<UserAccount> createUser(@RequestBody UserAccount user) {
        UserAccount createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/updateByID/{id}")
    public ResponseEntity<UserAccount> updateUser(@PathVariable Integer id, @RequestBody UserAccount user) {
        user.setId(id);
        UserAccount updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

}
