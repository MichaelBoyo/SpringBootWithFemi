package com.femisboot.springbootwithfemi.data.repositories;

import com.femisboot.springbootwithfemi.data.models.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,String> {
}
