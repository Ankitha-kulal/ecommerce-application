package com.aiet.ecommerce_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiet.ecommerce_application.model.Product;
import com.aiet.ecommerce_application.repository.Productrepository;

@Service
public class ProductService {
	
	private Productrepository productRepository;
	
	@Autowired
	public ProductService(Productrepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	//get all products
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	//addprodct to the database
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
	}
	// get the expensive product
	
	public List<Product> getExpensiveProduct(double price){
		return productRepository.findByPriceGreaterThan(price);
	}
	
	// delete the product by id
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	
	
}
