package com.DevHugo.ProductsApi.dto;

import com.DevHugo.ProductsApi.entity.Product;

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

	public ProductDTO() {
	}

	public ProductDTO(Long id,String name,Double price, Integer quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductDTO(Product product) {
		id =product.getId();
		name = product.getName();
		price = product.getPrice();
		quantity = product.getQuantity();
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
	
	
	
	
}
