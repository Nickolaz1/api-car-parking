package com.app.quazar.carparking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "tb_vagas")
public class Lots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "The field price cannot be empty")
    private Double price;

    @NotEmpty(message = "The field pcd cannot be empty")
    private Boolean pcd;

    @NotEmpty(message = "The field status cannot be empty")
    private Boolean status;

    public Lots() {
    }

    public Lots(Long id, Double price, Boolean pcd, Boolean status) {
        this.id = id;
        this.price = price;
        this.pcd = pcd;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Boolean getPcd() {
        return pcd;
    }
    public void setPcd(Boolean pcd) {
        this.pcd = pcd;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    } 
}
