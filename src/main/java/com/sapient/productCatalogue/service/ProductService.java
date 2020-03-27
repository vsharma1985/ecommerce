package com.sapient.productCatalogue.service;

import java.util.List;

import com.sapient.productCatalogue.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
