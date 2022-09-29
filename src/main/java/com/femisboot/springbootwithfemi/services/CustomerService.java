package com.femisboot.springbootwithfemi.services;

import com.femisboot.springbootwithfemi.data.dtos.requests.LoginRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.Response;
import com.femisboot.springbootwithfemi.data.dtos.requests.UserRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.UserResponse;

import java.util.List;

public interface CustomerService {
    Response registerCustomer(UserRequest request);


    UserResponse getCustomer(Long id);

    List<UserResponse> getAllCustomers();

    Response updateCustomer(UserRequest request);

    Response deleteCustomer(String email);

    Response deleteAllCustomers();
    Long count();
}
