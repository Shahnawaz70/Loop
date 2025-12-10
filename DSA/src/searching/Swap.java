package searching;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Please Enter 2nd Number");
		
		int b =sc.nextInt();
		System.out.println("Before Swapping A = " +a);
		System.out.println("Before Swapping B = " +b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println();
		System.out.println("After swapping A = " + a);
		System.out.println("After swapping B = " + b);
		
	}
}
