package com.DevHugo.ProductsApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevHugo.ProductsApi.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{
	
	
	
}
