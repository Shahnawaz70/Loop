package com.kodnest.string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String remove = str.replace(" ","");
		System.out.println(remove);
	}
}
