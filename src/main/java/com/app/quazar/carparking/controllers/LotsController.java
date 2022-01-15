package com.app.quazar.carparking.controllers;

import java.util.List;

import com.app.quazar.carparking.models.Lots;
import com.app.quazar.carparking.repositories.LotsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/lots")
public class LotsController {

    @Autowired
    private LotsRepository lotsRepository;
    
    @GetMapping
    public ResponseEntity<List<Lots>> listAllLots(){
        return new ResponseEntity<>(lotsRepository.findAll(), HttpStatus.OK);
    }
}
