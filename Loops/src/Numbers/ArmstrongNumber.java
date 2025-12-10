package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int digits = String.valueOf(num).length();
		int sum = 0;
		while(num > 0) {
			int digit = num %10;
			sum += Math.pow(digit, digits);
			num = num/10;
		}
		if(sum == temp)
			System.out.println("It's a armstrong number");
		else
			System.out.println("It's not a armstrong number");
	}
}
