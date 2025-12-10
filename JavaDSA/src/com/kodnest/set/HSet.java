package com.kodnest.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(null);
		System.out.println("Hash Set: " + hs);
//		hs.clear();   // It will clear all the elements from the hash set
		hs.getClass();
		System.out.println(hs);
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		lhs.add(null);
		System.out.println("Linked Hash Set: " + lhs);
		
	}
}
