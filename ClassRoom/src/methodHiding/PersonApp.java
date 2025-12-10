package methodHiding;

public class PersonApp {
	public static void main(String[] args) {
		Person person = new Person();
		Employee employee = new Employee();
		Manager manager = new Manager();
		Person.work();
		Employee.work();
		Manager.work();
		Person p;
		p = employee;
		p.work();
		p = manager;
		p.work();
	}

}
