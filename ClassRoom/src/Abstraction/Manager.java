package Abstraction;

public class Manager extends Employee {
	double bonus;
	public Manager(double bonus) {
		super("Rahat", 45000.00);
		this.bonus = bonus;
	}

	@Override
	public void calculateSalary() {
		salary = salary + bonus;

	}

	@Override
	public void displayInfo() {
		System.out.println("Maganer Name: "+ name);
		System.out.println("Manager Salary: " + salary);

	}

}
