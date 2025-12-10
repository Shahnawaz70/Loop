package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = 0;
		if(n == 0) {
			System.out.println("Fibonacci series of " + n + "th term is " + firstNumber);
			return;
		} else if(n == 1) {
			System.out.println("Fibonacci series of " + n + "th term is " + secondNumber);
			return;
		}
		for(int i = 2; i<=n; i++) {
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		System.out.println("Fibonacci series of " + n + "th termmis " + nextNumber);	
	}
}
