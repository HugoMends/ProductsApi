package com.DevHugo.ProductsApi.dto;

import com.DevHugo.ProductsApi.entity.Product;

public class ProductCategoryDTO {
	
	private Long id;
	private String name;
	private Double price;
	private Integer quantity;
	
	private CategoriesDTO category;

	public ProductCategoryDTO(Long id, String name, Double price, Integer quantity, CategoriesDTO category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public ProductCategoryDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		quantity = entity.getQuantity();
		category = new CategoriesDTO(entity.getCategory());
		
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

	public CategoriesDTO getCategory() {
		return category;
	}
	
	
	
	
}
