package com.app.quazar.carparking.controllers;

import javax.validation.Valid;

import com.app.quazar.carparking.models.ApplicationUser;
import com.app.quazar.carparking.repositories.ApplicationUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/user")
public class ApplicationUserController {

    @Autowired
    private ApplicationUserRepository userRepository;
    
    @PostMapping(path = "/cadastrar")
    public ApplicationUser saveUser(@RequestBody @Valid ApplicationUser user){
        return userRepository.save(user);
    }
}
