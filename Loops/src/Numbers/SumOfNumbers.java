package Numbers;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		double sum = 0;
		for(int i =1; i<=num; i++) {
			sum += 1.0/i;
		}
		System.out.println("Sum of numbers = " + sum);
	}
}
