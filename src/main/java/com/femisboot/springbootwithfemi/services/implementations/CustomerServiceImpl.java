package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.dtos.requests.LoginRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.Response;
import com.femisboot.springbootwithfemi.data.dtos.requests.UserRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.UserResponse;
import com.femisboot.springbootwithfemi.data.models.entities.Address;
import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import com.femisboot.springbootwithfemi.data.models.entities.Customer;
import com.femisboot.springbootwithfemi.data.models.enums.Authority;
import com.femisboot.springbootwithfemi.data.repositories.CustomerRepository;
import com.femisboot.springbootwithfemi.services.CartService;
import com.femisboot.springbootwithfemi.services.CustomerService;
import com.femisboot.springbootwithfemi.utils.Mapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Response registerCustomer(UserRequest request) {
        Customer customer = new Customer();
        Mapper.mapRequestToUser(request, customer);
        customer.setAddresses(new HashSet<>(Set.of(new Address(request.getCountry()))));
        customer = customerRepository.saveAndFlush(customer);
        return new Response(HttpStatus.OK, "Customer registered successfully ", customer.getId());
    }



    @Override
    public UserResponse getCustomer(Long id) {
        var customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        log.info("customer getMet -> {}", customer);
        return customer.toUserResponse();

    }

    @Override
    public List<UserResponse> getAllCustomers() {
        return customerRepository.findAll().stream().map(Customer::toUserResponse).toList();
    }

    @Override
    public Response updateCustomer(UserRequest request) {
        Customer customer = customerRepository.findById(request.getId()).orElseThrow(() -> new RuntimeException("not found"));
        Mapper.updateUSer(request, customer);
        customer = customerRepository.saveAndFlush(customer);
        return new Response(HttpStatus.OK, "Customer updated successfully",customer.getId());
    }

    @Override
    public Response deleteCustomer(String email) {
        return null;
    }

    @Override
    public Response deleteAllCustomers() {
        customerRepository.deleteAll();
        return new Response(HttpStatus.OK, "All customers deleted successfully");
    }

    @Override
    public Long count() {
        return customerRepository.count();
    }
}

