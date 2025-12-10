package Number;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int gcd = findGCD(num1, num2);
		// Print the GCD
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");
		scanner.close();
	}
	public static int findGCD(int a, int b) {
		while(a%b != 0) {
			int rem = a%b;
			a = b;
			b= rem;
		}
		return b;
	}
}
