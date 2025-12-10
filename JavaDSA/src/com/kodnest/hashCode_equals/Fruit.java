package com.kodnest.hashCode_equals;

import java.util.Objects;

public class Fruit {
	String name;
	public Fruit(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj) {
		Fruit ref = (Fruit) obj;
		if(this.name.equals(ref.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return Objects.hash(name);
		
	}
}
