package com.femisboot.springbootwithfemi.data.models.baseModel;

import com.femisboot.springbootwithfemi.data.models.entities.Address;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import java.util.Set;
@Data
public class LumExpressUser {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
}
