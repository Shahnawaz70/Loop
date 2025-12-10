package com.kodnest.framework_collection;

import java.util.Objects;

public class Student {
	int id;
	String name;
	int rollNumber;
	
	public Student(int id, String name, int rollNumber) {
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void setter(int id, String name, int rollNumber) {
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	@Override
	public String toString() {
		
		return "[ID: " + id + ", Name: " + name + ", Roll Number: " + rollNumber + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student ref = (Student) obj;
		if(this.name.equals(ref.name)) 
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
