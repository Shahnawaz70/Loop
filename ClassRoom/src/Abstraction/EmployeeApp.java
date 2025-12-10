package Abstraction;

public class EmployeeApp {
	public static void main(String[] args) {
		Company c = new Company();
		c.accept(new Manager(50000.0));
		c.accept(new Programmer("Rahaul", 70000.0, 1500.0));
	}
}
