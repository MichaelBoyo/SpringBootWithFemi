package com.femisboot.springbootwithfemi.data.dtos.requests;

import com.femisboot.springbootwithfemi.data.models.enums.Category;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.util.Set;
@Builder
@Data
public class ProductRequest {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private Set<Category> categories;
    private String imageUrl;
}
