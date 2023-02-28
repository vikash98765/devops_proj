package com.upes.devopsproj.dao;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.upes.devopsproj.*;
import com.upes.devopsproj.entity.Product;

public interface ProductRepository  extends JpaRepository<Product,Long> {
	
	
	

}
