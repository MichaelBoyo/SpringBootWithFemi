package com.femisboot.springbootwithfemi.data.repositories;

import com.femisboot.springbootwithfemi.data.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
