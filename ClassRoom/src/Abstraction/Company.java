package Abstraction;

public class Company {
	public static void accept(Employee ref) {
		ref.calculateSalary();
		ref.displayInfo();
	}
}
