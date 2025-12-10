package com.kodnest.framework_collection;

import java.util.*;

public class StackUsingArrayDeque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		int n = sc.nextInt();
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		for(int i =0; i<n; i++) {
			ad.push(sc.nextInt());
		}
		System.out.println("=================");
		System.out.println("Stack: ");
		for(Integer x : ad) {
			System.out.println(x);
		}
		System.out.println("=================");
		System.out.println(ad.pop());
		
		System.out.println("Updated Stack: ");
		for(Integer x : ad) {
			System.out.println(x);
		}
	}
}
