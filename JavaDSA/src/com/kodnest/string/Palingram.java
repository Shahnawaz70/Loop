package com.kodnest.string;

import java.util.Scanner;
import java.util.Arrays;

public class Palingram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String str1 = scanner.next();
		String str2 = scanner.next();
		boolean res = false;
		if (str1.length() == str2.length()) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			res = Arrays.equals(arr1, arr2);
			if (res)
				System.out.println("Are the strings anagrams? " + res);

		} else {
			System.out.println("Are the strings anagrams? " + res);
		}

		scanner.close();
	}
}