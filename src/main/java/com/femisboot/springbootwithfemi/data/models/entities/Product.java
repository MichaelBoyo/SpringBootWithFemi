package com.femisboot.springbootwithfemi.data.models.entities;

import com.femisboot.springbootwithfemi.data.models.enums.Category;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    @ElementCollection
    private Set<Category> categories;
    private String imageUrl;
}
