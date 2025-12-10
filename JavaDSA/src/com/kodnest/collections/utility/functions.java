package com.kodnest.collections.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class functions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.rotate(al, 150);
		System.out.println(al);
	}
}
