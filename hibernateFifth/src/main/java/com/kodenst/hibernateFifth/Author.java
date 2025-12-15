package com.kodenst.hibernateFifth;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String gender;
	@Column
	int age;
	@Column
	String address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	Book book;

	public Author() {
		super();
	}

	public Author(String name, String gender, int age, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public Author(String name, String gender, int age, String address, Book book) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.book = book;
	}

	public Author(int id, String name, String gender, int age, String address, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.book = book;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ ", book=" + book + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, book, gender, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(book, other.book)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name);
	}

}
