package Recursion;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int res = factorial(num);
		System.out.println("Factorial of " + num + " is = " + res);
	}
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		return n*factorial(n-1); 
	}
}
