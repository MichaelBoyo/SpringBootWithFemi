package com.femisboot.springbootwithfemi.data.models.entities;

import com.femisboot.springbootwithfemi.data.models.enums.Authority;
import com.femisboot.springbootwithfemi.data.models.baseModel.LumExpressUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Setter
@Getter
@Entity
public class Seller extends LumExpressUser {
    @Id
    private Long id;
    @OneToOne
    private Store store;
    private Authority authority;
}
