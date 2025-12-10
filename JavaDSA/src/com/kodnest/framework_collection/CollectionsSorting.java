package com.kodnest.framework_collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSorting {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Alam");
		al.add("Pakija");
		al.add("Nikhat");
		al.add("Deepa");
		al.add("Tarana");
		al.add("Palvinder");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
	}
}	
