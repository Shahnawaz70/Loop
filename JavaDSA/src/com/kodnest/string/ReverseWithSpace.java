package com.kodnest.string;

import java.util.Scanner;

public class ReverseWithSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		String rev ="";
		for(int i=0; i<str1.length; i++) {
			String temp = str1[i];
			temp = reverse(temp);
			rev = rev + temp + " ";
		}
		System.out.println("Reversed String: " + rev);
		sc.close();
	}
	
	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
		
	}
}
