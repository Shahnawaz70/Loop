package com.kodnest.framework_collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IterableFramework {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(25);
		al.add(50);
		al.add(150);
		al.add(175);
		
		System.out.println(al);
		
		System.out.println("====================================");
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("====================================");
		
		for(Object x : al) {
			System.out.println(x);
		}
		
		System.out.println("====================================");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
