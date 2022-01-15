package com.app.quazar.carparking.repositories;

import com.app.quazar.carparking.models.ApplicationUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>{
    ApplicationUser findByUsername(String username);
}
