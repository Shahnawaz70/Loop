package com.kodnest.array;

import java.util.Scanner;

public class Customers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customers number");
		String[] names = new String[sc.nextInt()];
		sc.nextLine();
		System.out.println("Enter Customers names");
		for(int i =0; i<names.length; i++) {
			names[i] = sc.nextLine();
		}
		System.out.println("Customers Name");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
}
