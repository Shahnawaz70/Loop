package com.kodnest.framework_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQue2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			al.add(sc.nextInt());
		}
		int index = sc.nextInt();
		System.out.println("Element at index: " + index + ": " + al.get(index));
		
	}
}
