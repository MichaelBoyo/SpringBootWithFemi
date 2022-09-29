package com.femisboot.springbootwithfemi.data.repositories;

import com.femisboot.springbootwithfemi.data.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
