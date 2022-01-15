package com.app.quazar.carparking.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_user")
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "The field name cannot be empty")
    private String name;

    @NotEmpty(message = "The field username cannot be empty")
    @Column(unique = true)
    private String username;
    
    @NotEmpty(message = "The field password cannot be empty")
    private String password;

    public ApplicationUser() {
    }

    public ApplicationUser(ApplicationUser applicationUser){
        id = applicationUser.getId();
        name = applicationUser.getName();
        username = applicationUser.getUsername();
        password = applicationUser.getPassword();
    }

    public ApplicationUser(Long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
