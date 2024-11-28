package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    // Getters and setters
}
