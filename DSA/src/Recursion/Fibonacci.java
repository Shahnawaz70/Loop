package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Fibonacci = " + fibonacci(num));
	}
	public static int fibonacci(int num) {
		if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
