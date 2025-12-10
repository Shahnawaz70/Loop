package com.kodnest.string;

import java.util.Scanner;

public class CharacterFrequencyCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string");
		String s = scanner.nextLine();
		String unique="";
		int count =0;
		System.out.println("Character frequnecy:");
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			count =0;
			for(int j=0; j<s.length(); j++) {
				if(c == s.charAt(j))
					count++;
			}
			if(unique.contains(c + "") == false) {
				System.out.println(c + ": " + count);
				unique += c;
			}
		}
		
		scanner.close();      
	}
}
