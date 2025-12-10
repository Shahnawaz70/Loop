package com.kodnest.string;

import java.util.Scanner;

public class DisplayingString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Read input from the user
		System.out.print("Enter a line of text: ");
		String userInput = scanner.nextLine();

		// Create a string using double quotes
		String stringLiteral = userInput;

		// Create a string using the new keyword
		String stringObject = new String(userInput);

		// Display both strings
		System.out.println("String created using double quotes: " + stringLiteral);
		System.out.println("String created using new keyword: " + stringObject);

		// Compare references using '=='
		boolean areSameReference = (stringLiteral == stringObject);
		System.out.println("Are the two strings equal by '=='? " + areSameReference);

		// Compare contents using 'equals()'
		boolean haveSameContent = stringLiteral.equals(stringObject);
		System.out.println("Are the two strings equal by 'equals()'? " + haveSameContent);

		scanner.close();
	}
}
