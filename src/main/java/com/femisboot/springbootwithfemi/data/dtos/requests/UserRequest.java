package com.femisboot.springbootwithfemi.data.dtos.requests;

import lombok.Data;


@Data
public class UserRequest{
    private Long id;
    private Integer houseNumber;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public UserRequest(Integer houseNumber, String street, String city, String state, String zipCode, String firstname, String lastname, String email, String phoneNumber) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;
    public UserRequest(String email, String password, String country){
        this.email = email;
        this.password = password;
        this.country = country;
    }


}