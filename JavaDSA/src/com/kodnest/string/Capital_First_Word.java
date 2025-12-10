package com.kodnest.string;

import java.util.Scanner;

public class Capital_First_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		String reqStr ="";
		for(int i=0; i<arr.length; i++) {
			char c = arr[i].charAt(0);
			String c1= String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			reqStr = reqStr + c1 + sub + " ";
			
			
		}
		System.out.println(reqStr.trim());
	}
}
