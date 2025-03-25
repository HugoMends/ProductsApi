package com.DevHugo.ProductsApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevHugo.ProductsApi.dto.ProductDTO;
import com.DevHugo.ProductsApi.entity.Product;
import com.DevHugo.ProductsApi.repositories.ProductsRepository;
import com.DevHugo.ProductsApi.services.exceptions.ResourceNotFoundException;



@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable){
		Page<Product> result = repo.findAll(pageable);
		return result.map(product ->(new ProductDTO(product)));
	}
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product prod = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new ProductDTO(prod);
	}
	
	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		Product entity = new Product();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		entity = repo.save(entity);
		return new ProductDTO(entity);
	}
	
	@Transactional
	public ProductDTO update(ProductDTO dto, Long id) {
		
		Product entity = repo.getReferenceById(id);
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		entity = repo.save(entity);
		return new ProductDTO(entity);
	}
	
	@Transactional
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
