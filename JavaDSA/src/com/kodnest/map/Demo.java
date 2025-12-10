package com.kodnest.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Pakija");
		hm.put(2, "Nikhat");
		hm.put(3, "Deepa");
		hm.put(4, "Tarana");
		hm.put(5, "Palvinder");
		
		System.out.println(hm);
		
		LinkedHashMap<String, Integer> lhs = new LinkedHashMap<String, Integer>();
		
		lhs.put("One", 100);
		lhs.put("Two", 200);
		lhs.put("Three", 300);
		lhs.put("Four", 500);
		lhs.put("Five", 400);
		
		
		System.out.println(lhs);
		
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(1, 500);
		tm.put(2, 1500);
		tm.put(4, 2500);
		tm.put(3, 1000);
		tm.put(1, 200);
		
		System.out.println(tm);
		
	}
}
