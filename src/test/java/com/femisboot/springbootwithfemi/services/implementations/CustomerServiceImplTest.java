package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.dtos.requests.UserRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.Response;
import com.femisboot.springbootwithfemi.data.dtos.responses.UserResponse;
import com.femisboot.springbootwithfemi.data.models.entities.Customer;
import com.femisboot.springbootwithfemi.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.UnknownServiceException;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j

class CustomerServiceImplTest {
    @Autowired
    private CustomerService customerService;
    private Response res;
    UserRequest request;
    UserRequest updateRequest;

    @BeforeEach
    void setUp() {
        request = new UserRequest(
                "mike@gmail.com",
                "12345",
                "Nigeria"
        );

        updateRequest = new UserRequest(12,"test street",
                "test city","test state",
                "100101","test_firstname",
                "test_lastname",request.getEmail(),"08103297538");


        res = customerService.registerCustomer(request);
        updateRequest.setId(res.getId());
    }

    @AfterEach
    void tearDown() {
        customerService.deleteAllCustomers();
    }

    @Test
    void registerCustomer() {
        assertEquals(1L, customerService.count());
    }



    @Test
    void getCustomerByEmail() {
        UserResponse userResponse = customerService.getCustomer(res.getId());
        assertEquals(request.getEmail(), userResponse.getEmail());
    }

    @Test
    void getAllCustomers() {
        assertNotEquals(Collections.emptyList(), customerService.getAllCustomers());
    }

    @Test
    void updateCustomer() {
        customerService.updateCustomer(updateRequest);
        UserResponse userResponse = customerService.getCustomer(res.getId());
        log.info("userResponse -> {}", userResponse);
        assertEquals(updateRequest.getFirstname(), userResponse.getFirstname());
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void deleteAllCustomers() {
    }
}