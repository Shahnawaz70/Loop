package Numbers;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num = sc.nextInt();
		int i = 1;
		System.out.println("Multiplication Table of " + num + " is");
		while(i<=num) {
			System.out.println(num +" x " + i + " = " + (num*i) );
			i++;
		}
	}
}

