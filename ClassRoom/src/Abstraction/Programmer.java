package Abstraction;

public class Programmer extends Employee {
	double bonus;
	public Programmer(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	
	@Override
	public void calculateSalary() {
		salary = salary + bonus;
	}

	@Override
	public void displayInfo() {
		System.out.println("Programmer Name: " + name);
		System.out.println("Progarmmer Salary: " + salary);

	}

}
