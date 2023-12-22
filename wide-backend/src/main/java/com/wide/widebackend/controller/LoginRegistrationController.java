package com.wide.widebackend.controller;

import com.wide.widebackend.Entity.User;
import com.wide.widebackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/w-ide/api")
public class LoginRegistrationController {

    @Autowired
    UserService userService;
    Logger logger = LoggerFactory.getLogger(LoginRegistrationController.class);



    @PostMapping(value = "/login")
    public ResponseEntity<String> login(){
        //todo:implement login
        return ResponseEntity.ok().body("token");
    }

    //user registration api
    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody User user){
        try {
            userService.saveUser(user);
            return ResponseEntity.ok("user registered");
        }catch (Exception e){
            logger.error("an error has occurred while trying to register user");
            return ResponseEntity.badRequest().build();
        }
    }
}
