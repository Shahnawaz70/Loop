package com.kodnest.string;

import java.util.Scanner;

public class RegesString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
        String str = scanner.nextLine();
        String regex = "[a-zA-Z]+";
        System.out.println("Does the string start with \"Hello\"? " + str.startsWith("Hello"));
        System.out.println("Does the string end with \"World!\"? " + str.endsWith("World!"));
        System.out.println("Is the string empty? " + str.isEmpty());
        System.out.println("Does the string contain only letters? " + str.contains(regex));
        scanner.close();
	}
}
