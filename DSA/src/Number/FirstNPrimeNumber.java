package Number;

import java.util.Scanner;

public class FirstNPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count =0;
		int num =2;
		System.out.println("The first " + n + " prime numbers are:");
		while(count < n) {
			if(prime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}
	public static boolean prime(int num) {
		if(num <2) 
			return false;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num %i ==0)
				return false;
		}
		return true;
	}
}
