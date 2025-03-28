package com.DevHugo.ProductsApi.dto;

import com.DevHugo.ProductsApi.entity.Categories;

import jakarta.validation.constraints.NotBlank;

public class CategoriesDTO {
	
	private Long id;
	@NotBlank
	private String name;
	
	public CategoriesDTO() {
	}

	public CategoriesDTO(Long id, @NotBlank String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CategoriesDTO(Categories category) {
		id = category.getId();
		name = category.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
