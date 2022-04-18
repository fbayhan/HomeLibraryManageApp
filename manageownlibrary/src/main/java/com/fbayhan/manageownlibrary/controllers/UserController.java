package com.fbayhan.manageownlibrary.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("newuser")
     public String newUser(){

         return "User added";
     }

}
