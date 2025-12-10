package com.kodnest.string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		StringBuffer str = new StringBuffer(scanner.next());
		StringBuffer rev = new StringBuffer((str).reverse());

		if (rev.toString().equals(str.toString()))
			System.out.println("The string '" + str + "' is a palindrome.");
		else
			System.out.println("The string '" + str + "' is not a palindrome.");
		scanner.close();

	}
}
