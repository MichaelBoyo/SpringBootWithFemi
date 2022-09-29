package com.femisboot.springbootwithfemi.data.repositories;

import com.femisboot.springbootwithfemi.data.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
