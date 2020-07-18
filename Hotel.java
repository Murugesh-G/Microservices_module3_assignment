package com.edureka.travelcompany.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private String city;
    private int rating;

    public Hotel(String name, String description, String city, int rating) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.rating = rating;
    }
}