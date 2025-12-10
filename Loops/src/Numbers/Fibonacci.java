package Numbers;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci Number " + a + " " + b + " ");
		for(int i = 2; i<=num; i++) {
			int fib = a + b;
			System.out.print(fib + " ");
			a = b;
			b = fib;
			
		}
		
	}
}
