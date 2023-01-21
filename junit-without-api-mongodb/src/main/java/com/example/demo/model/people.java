package com.example.demo.model;


import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class people {
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "people [id=" + id + ", name=" + name + "]";
	}
}
