package innerclass;

public class GreeterApp {
	public static void main(String[] args) {
		Greeter g = new Greeter() {

			public void greet() {
				System.out.println("Hello");

			}

			public void greetUser(String user) {
				System.out.println("Good morning! " + user);

			}

			public void greet(String user, int noOfTimes) {
				System.out.println("Hello, " + user + " No of times: " + noOfTimes);

			}
		};
		g.greet();
		g.greetUser("Raja");
		g.greet("Alam", 3);
	}
}
