package com.upes.ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.upes.devopsproj.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel ="productCategory",path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long>{

	
	
	
	
}
