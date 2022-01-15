package com.app.quazar.carparking.services;

import com.app.quazar.carparking.repositories.LotsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotsService {
    @Autowired
    private LotsRepository lotsRepository;

}
