package com.femisboot.springbootwithfemi.data.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer houseNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    public Address(String country){
        this.country = country;
    }
}
