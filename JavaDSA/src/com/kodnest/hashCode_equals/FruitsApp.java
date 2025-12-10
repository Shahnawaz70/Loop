package com.kodnest.hashCode_equals;

import java.util.HashSet;

public class FruitsApp {
	public static void main(String[] args) {
		Fruit f1 = new Fruit("Apple");
		Fruit f2 = new Fruit("PineApple");
		Fruit f3 = new Fruit("WoodApple");
		Fruit f4 = new Fruit("CustardApple");
		Fruit f5 = new Fruit("CustardApple");
		Fruit f6 = new Fruit("PineApple");
		HashSet hs = new HashSet();
		hs.add(f1);
		hs.add(f2);
		hs.add(f3);
		hs.add(f4);
		hs.add(f5);
		hs.add(f6);
		System.out.println(hs);
		
	}
}
