package com.kodnest.hashCode_equals;

import java.util.Objects;

public class Car {
	private String model;
	private int year;
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		return "Car{model='" + model + "', year=" + year + "}";
	}
	
	public boolean equals(Object obj) {
		Car ref = (Car) obj;
		if(this.model.equals(ref.model)) {
			return true;
		}
		else if(this.year == ref.year) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return Objects.hash(model, year);
		
	}
	
}
