package Abstraction;

public abstract class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public abstract void calculateSalary();
	public abstract void displayInfo();
}
