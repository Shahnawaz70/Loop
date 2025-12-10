package com.kodnest.string;

import java.util.Scanner;

public class ExtractingDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = scanner.nextLine();
		String digits = input.replaceAll("\\D", "");
		System.out.println("Extracted Digits: " + digits);
		scanner.close();
	}
}
