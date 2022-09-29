package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import com.femisboot.springbootwithfemi.data.repositories.CartRepository;
import com.femisboot.springbootwithfemi.services.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

}
