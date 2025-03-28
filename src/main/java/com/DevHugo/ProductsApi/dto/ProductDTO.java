package com.DevHugo.ProductsApi.dto;

import com.DevHugo.ProductsApi.entity.Categories;
import com.DevHugo.ProductsApi.entity.Product;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductDTO {
	
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 80, message = "Nome precisa ter no minimo 3 caracteres e no maximo 80!")
	private String name;
	
	@NotBlank
	private Double price;
	
	@NotBlank
	private Integer quantity;
	
	private Long categoryId;

	public ProductDTO() {
	}

	public ProductDTO(Long id,String name,Double price, Integer quantity, Long categoryId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.categoryId = categoryId;
	}
	
	public ProductDTO(Product product) {
		id =product.getId();
		name = product.getName();
		price = product.getPrice();
		quantity = product.getQuantity();
		this.categoryId = product.getCategory().getId();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Long getCategoryId() {
		return categoryId;
	}


	
	
	
	
	
}
