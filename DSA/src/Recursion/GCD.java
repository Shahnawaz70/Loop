package Recursion;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Greatest Common Divisor is " + gcd(num1,  num2));
	}
	public static int gcd(int a, int b) {
		if(a%b ==0)
			return b;
		return gcd(b, a%b);
		
	}
}
