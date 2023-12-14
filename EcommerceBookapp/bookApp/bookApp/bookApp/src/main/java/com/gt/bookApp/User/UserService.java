package com.gt.bookApp.User;

import com.gt.bookApp.Books.BooksDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository ) {
        this.userRepository= userRepository;
    }

    public List<UserAccount> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<UserAccount> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public UserAccount createUser(UserAccount user) {
        return userRepository.save(user);
    }

    public UserAccount updateUser(UserAccount user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }




    //injectez repozitory
    //scriu metodeleCRUD
}
