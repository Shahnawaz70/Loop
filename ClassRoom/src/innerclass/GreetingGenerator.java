package innerclass;

public class GreetingGenerator {
	String generateGreeting(String name, String time) {
		class Greeting {
			String greet() {
				return "Good " + time + ", " + name + "!";
			}
		}

		Greeting greeting = new Greeting();
		return greeting.greet();
	}
}
