package com.kodnest.string;

import java.util.Scanner;

public class LongestSubString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a stringa");
		String s = scan.nextLine();
		int maxlength = 0;
		// traversing each character in the string
		// traverse through each starting position of a substring 
		for(int i = 0; i < s.length(); i++) {
			String r = "";
			// Extend substring until a repeated character found
			for(int j = i; j < s.length(); j++) {
				char c = s.charAt(j);
			// stop extending substring on founding repeat character 
				if (r.indexOf(c) != -1)
					break;
				
				r += c;
			// store the length of substring in variable if greater	
				if (r.length() > maxlength)
					maxlength = r.length();
			}
		}
		System.out.println("The length of the longest substring without repeating characters is: " + maxlength);
		scan.close();
	}

}