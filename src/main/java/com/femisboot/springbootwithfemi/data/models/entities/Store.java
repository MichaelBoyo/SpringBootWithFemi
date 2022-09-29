package com.femisboot.springbootwithfemi.data.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    @Id
    private Long id;
    private String name;
    private String address;
    @OneToMany
    private Set<Product> products;
}
