package com.femisboot.springbootwithfemi.data.repositories;

import com.femisboot.springbootwithfemi.data.models.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {

}

