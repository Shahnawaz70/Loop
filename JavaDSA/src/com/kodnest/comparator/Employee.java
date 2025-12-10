package com.kodnest.comparator;

import java.util.Comparator;

public class Employee {
	private String name;
	private int id;
	private String designation;
	private int salary;
	private double experience;
	
	public Employee(String name, int id, String designation, int salary, double experience) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public String getDesignation() {
		return designation;
	}


	public int getSalary() {
		return salary;
	}


	public double getExperience() {
		return experience;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	
	
	
}
