package com.kodnest.string;

import java.util.Scanner;

public class ContainsFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the main string:");
        String mainStr = scanner.nextLine();

        System.out.println("Enter the substring to check:");
        String subStr = scanner.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("The substring '" + subStr + "' is found in the main string.");
        } else {
            System.out.println("The substring '" + subStr + "' is not found in the main string.");
        }
		scanner.close();
	}
}
