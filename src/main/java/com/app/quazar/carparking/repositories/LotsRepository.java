package com.app.quazar.carparking.repositories;

import com.app.quazar.carparking.models.Lots;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LotsRepository extends JpaRepository<Lots, Long> {
    
}
