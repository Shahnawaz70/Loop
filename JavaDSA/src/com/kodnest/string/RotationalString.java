package com.kodnest.string;

import java.util.Scanner;

public class RotationalString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string");
		String originalString = sc.nextLine();
		String keyString = sc.nextLine();
		String newString = originalString.concat(originalString);
		if(newString.contains(keyString))
			System.out.println("The string '" + keyString + "' is a rotation of '" + originalString + "'.");
		else
			System.out.println("This string is not a rotational string");
	}
}	
