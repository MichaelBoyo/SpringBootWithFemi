package com.femisboot.springbootwithfemi.data.dtos.responses;

import com.femisboot.springbootwithfemi.data.models.entities.Address;
import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserResponse {
    private Long id;
    private Cart cart;
    private Set<Address> addresses;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;

}
