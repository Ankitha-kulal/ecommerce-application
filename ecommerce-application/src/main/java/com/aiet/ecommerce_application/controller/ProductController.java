package com.aiet.ecommerce_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aiet.ecommerce_application.model.Product;
import com.aiet.ecommerce_application.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getproductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/expensive")
	public List<Product> getExpensiveProduct(@RequestParam double price){
		return productService.getExpensiveProduct(price);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	}
