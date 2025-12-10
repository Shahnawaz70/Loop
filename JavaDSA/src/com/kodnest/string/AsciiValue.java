package com.kodnest.string;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a charcater");
	        char ch = scanner.next().charAt(0);
	        int ascii = (int) ch;
	        System.out.println("The ASCII value of '" + ch + "' is : " + ascii);
	        scanner.close();
	}
}
