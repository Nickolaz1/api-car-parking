package com.app.quazar.carparking.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/v1/client")
public class ClientController {

    // @GetMapping(path = "/lots")
    // public ResponseEntity<List<Lots>> findYourLots() {
    //     return 
    // }
    

    @PostMapping
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("Hi", HttpStatus.OK);
    }
}
