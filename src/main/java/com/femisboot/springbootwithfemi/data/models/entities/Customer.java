package com.femisboot.springbootwithfemi.data.models.entities;

import com.femisboot.springbootwithfemi.data.dtos.responses.UserResponse;
import com.femisboot.springbootwithfemi.data.models.baseModel.LumExpressUser;
import com.femisboot.springbootwithfemi.data.models.enums.Authority;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Cart cart;
    private Authority authority;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<Address> addresses;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;

    public UserResponse toUserResponse() {
        return UserResponse.builder()
                .id(id)
                .firstname(firstname)
                .lastname(lastname)
                .email(email)
                .cart(cart)
                .addresses(addresses)
                .phoneNumber(phoneNumber)
                .build();
    }
}
