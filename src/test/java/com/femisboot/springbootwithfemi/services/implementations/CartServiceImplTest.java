package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import com.femisboot.springbootwithfemi.services.CartService;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CartServiceImplTest {
    @Autowired
    private  CartService cartService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Test create cart")
    void createCart() {


    }
}