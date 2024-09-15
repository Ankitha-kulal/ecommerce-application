package com.aiet.ecommerce_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiet.ecommerce_application.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
