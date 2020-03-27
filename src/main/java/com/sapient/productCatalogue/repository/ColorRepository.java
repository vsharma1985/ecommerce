package com.sapient.productCatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productCatalogue.entity.Color;

@Repository
public interface ColorRepository 
        extends JpaRepository<Color, Integer> {
}
