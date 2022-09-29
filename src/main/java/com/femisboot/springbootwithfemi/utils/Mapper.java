package com.femisboot.springbootwithfemi.utils;

import com.femisboot.springbootwithfemi.data.dtos.requests.UserRequest;
import com.femisboot.springbootwithfemi.data.models.entities.Address;
import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import com.femisboot.springbootwithfemi.data.models.entities.Customer;
import com.femisboot.springbootwithfemi.data.models.enums.Authority;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;


public class Mapper{
    public static void mapRequestToUser(UserRequest request, Customer customer) {
        customer.setEmail(request.getEmail());
        customer.setPassword(request.getPassword());
        customer.setCart(new Cart());
        customer.setAddresses(new HashSet<>(Set.of(new Address(request.getCountry()))));
        customer.setAuthority(Authority.BUY);
    }
    public static void updateUSer(UserRequest request,Customer customer){
        if(request.getFirstname() != null){
            customer.setFirstname(request.getFirstname());
        }
        if(request.getLastname() != null){
            customer.setLastname(request.getLastname());
        }
        updateAddress(request, customer);
        if(request.getPhoneNumber() != null){
            customer.setPhoneNumber(request.getPhoneNumber());
        }
    }

    private static void updateAddress(UserRequest request, Customer customer) {
        if(request.getCountry() == null){
            customer.getAddresses().stream().findFirst().ifPresent(address -> {
                if(request.getCity() != null){
                    address.setCity(request.getCity());
                }
                if(request.getStreet() != null){
                    address.setStreet(request.getStreet());
                }
                if(request.getZipCode() != null){
                    address.setZipCode(request.getZipCode());
                }
                if(request.getState() != null){
                    address.setState(request.getState());
                }
                if(request.getHouseNumber() != null){
                    address.setHouseNumber(request.getHouseNumber());
                }

            });
        }
    }

}
