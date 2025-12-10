package com.kodnest.string;

import java.util.Scanner;

public class CountsOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		System.out.println("Word count: " + str1.length);
		sc.close();
	}
}
