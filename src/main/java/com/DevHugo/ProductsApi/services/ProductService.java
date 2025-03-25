package com.DevHugo.ProductsApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.DevHugo.ProductsApi.dto.ProductDTO;
import com.DevHugo.ProductsApi.entity.Product;
import com.DevHugo.ProductsApi.repositories.ProductsRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable){
		Page<Product> result = repo.findAll(pageable);
		return result.map(product ->(new ProductDTO(product)));
	}
	
	
}
