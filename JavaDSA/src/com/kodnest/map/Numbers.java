package com.kodnest.map;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class Numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of WeakHasMap");
		int n = sc.nextInt();
		WeakHashMap<Integer, String> numbers = new WeakHashMap<Integer, String>();
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			numbers.put(id, name);
			System.out.println("Added token: " + id + " -> " + name);
		}
		System.out.println("Enter a token ID to check:");
        int tokenId = sc.nextInt();
        System.out.println("Token " + tokenId + " exists: " + numbers.containsKey(tokenId));
        
	}
}
