package com.gt.bookApp.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

    @GetMapping("/home")
    public String homepage() {
        return "home";
    }

    @GetMapping("/user")
    public String userpage() {
        return "userpage";
    }
}


