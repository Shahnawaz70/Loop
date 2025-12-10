package Number;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		
		int digits = String.valueOf(num).length();
//		while(num >0) {
//			num = num /10;
//			digits++;
//		}
		int sum =0;

		while(num > 0) {
			int digit = num %10;
			sum += (Math.pow(digit, digits));
			num = num /10;
		}
		if(temp == sum) {
			System.out.println(temp + " is s armstrong Number");
		} else {
			System.out.println(temp + " is not a armstrong number");
		}
	}
}
