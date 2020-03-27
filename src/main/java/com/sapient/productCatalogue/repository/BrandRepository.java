package com.sapient.productCatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productCatalogue.entity.Brand;

@Repository
public interface BrandRepository 
        extends JpaRepository<Brand, Integer> {
 
}
