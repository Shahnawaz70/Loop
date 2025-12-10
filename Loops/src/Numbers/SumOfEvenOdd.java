package Numbers;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first and last number");
//		int start  = sc.nextInt();
//		int end = sc.nextInt();
//		int evenSum =0;
//		int oddSum = 0;
//		for(int i = start; i<=end; i++) {
//			if(i %2 == 0)
//				evenSum = evenSum + i;
//			else
//				oddSum = oddSum + i;
//		}
//		System.out.println("Sum of even number " + evenSum);
//		System.out.println("Sum of odd number " + oddSum);
		
		//Second Type 
		
		int num;
		char choice;
		int evenSum = 0;
		int oddSum = 0;
		do {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if(num % 2 == 0)
				evenSum = evenSum + num;
			else
				oddSum = oddSum + num;
			System.out.println("Do you want to cointinue Y / N");
			choice = sc.next().charAt(0);
		} while(choice == 'Y' || choice == 'N');
		System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
	}
}
