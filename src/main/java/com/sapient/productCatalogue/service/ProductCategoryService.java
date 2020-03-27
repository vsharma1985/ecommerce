package com.sapient.productCatalogue.service;

import java.util.List;

import com.sapient.productCatalogue.entity.ProductCategory;

public interface ProductCategoryService {
	List<ProductCategory> findAll();
}
