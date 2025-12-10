package innerclass;

public class GreetingGeneratorApp {
	public static void main(String[] args) {
        GreetingGenerator generator = new GreetingGenerator();
        String greeting = generator.generateGreeting("Alice", "morning");
        System.out.println(greeting);
    }
}
