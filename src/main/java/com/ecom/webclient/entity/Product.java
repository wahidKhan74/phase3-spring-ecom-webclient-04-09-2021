package com.ecom.webclient.entity;


public class Product {
	
	// properties
	private long id;	
	private String name;
	private double price;
	private String description;
	
	// constructor
	public Product(long id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	// getter & setter
	public Product() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	//override toString()
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name +
				", price=" + price + ", description=" + description + "]";
	}	
	
	
	
	
}
