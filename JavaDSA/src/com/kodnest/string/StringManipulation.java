package com.kodnest.string;

import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String newString ="";
		System.out.println("Enter number of position for rotation and Direction");
		int pos = sc.nextInt();
		String direction = sc.next();
		String d = direction.toLowerCase();
		if(d.equals("left"))
			newString = str.substring(pos) + str.substring(0, pos);
		else if(d.equals("right"))
			newString = str.substring(str.length()-pos) + str.substring(0,str.length()-pos);
		
		System.out.println("Rotatte String: " + newString);
	}
}
