import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size");
		Stack stack = new Stack(sc.nextInt());
		System.out.println("Enter Stack element which you want to push");
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		stack.push(sc.nextInt());
		System.out.println("==================");
		stack.display();
		System.out.println("Sum of Stack is: " + stack.sum());
		stack.pop();
	}
}
