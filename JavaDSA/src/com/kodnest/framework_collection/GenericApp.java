package com.kodnest.framework_collection;

import java.util.ArrayList;

public class GenericApp {
	public static void main(String[] args) {
		Generic<Integer> g = new Generic<Integer>();
		g.a=100;
		g.b=200;
		System.out.println("Sum is: " + (g.a + g.b));
		
		g.display("Ram", 3.566);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rama");
//		al.add(100);  Not permitted
		
		
	}
}
