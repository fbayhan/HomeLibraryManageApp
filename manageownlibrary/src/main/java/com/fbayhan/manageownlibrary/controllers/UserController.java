package com.fbayhan.manageownlibrary.controllers;

import com.fbayhan.manageownlibrary.entities.User;
import com.fbayhan.manageownlibrary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("newuser")
    public String newUser() {
        User  newUser= userService.newUser();
        System.out.println(newUser.toString());
        return "User added";
    }


    //New user


}
