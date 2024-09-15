package com.aiet.ecommerce_application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiet.ecommerce_application.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product, Long>{
	//lets write a custom query
	List<Product> findByPriceGreaterThan(double price);
	
}
