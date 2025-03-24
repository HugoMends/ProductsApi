package com.DevHugo.ProductsApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevHugo.ProductsApi.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Long>{

}
