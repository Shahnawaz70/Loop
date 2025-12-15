package com.kodenst.hibernateFifth;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	int price;
	@Column
	int pages;
	
	public Book() {
		super();
	}

	public Book(String name, int price, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.pages = pages;
	}

	public Book(int id, String name, int price, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pages = pages;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pages=" + pages + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, pages, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id && Objects.equals(name, other.name) && pages == other.pages && price == other.price;
	}
	
	
}
