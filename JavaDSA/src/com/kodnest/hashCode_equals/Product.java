package com.kodnest.hashCode_equals;

import java.util.Objects;

public class Product {
	private int id;
	private String name;
	private int price;
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "{Product Id: " + id + ", Product Name: " + name + ", Product Price: " + price+ "}";
	}
	
	public boolean equals(Object obj) {
		Product ref = (Product) obj;
		if(this.name.equals(ref.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
	
	
	
}
