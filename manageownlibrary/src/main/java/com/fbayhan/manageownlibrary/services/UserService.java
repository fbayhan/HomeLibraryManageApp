package com.fbayhan.manageownlibrary.services;

import com.fbayhan.manageownlibrary.entities.User;
import com.fbayhan.manageownlibrary.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserService {

    UserRepository userRepository;


    public User newUser(){
        User newUser=new User();

        newUser.setActive(true);
        newUser.setUserName("fbayhan");
        newUser.setCreatedDate(new Date());
        newUser.setEmailAdress("a@b.com");
        newUser.setForgetPassword(false);
        newUser.setSurname("bayhan");
        newUser.setPasswordUsable(true);
        newUser.setMailConfirmed(true);
        newUser.setName("fatih");
        userRepository.save(newUser);
        return newUser;
    }


}
