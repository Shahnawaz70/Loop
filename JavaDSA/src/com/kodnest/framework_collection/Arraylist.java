package com.kodnest.framework_collection;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("Alam");
		System.out.println(al.contains(al));
		System.out.println(al.size());
		
		ArrayList al2 = new ArrayList();
		al2.add(500);
		al2.add(200);
		al2.add(3.5);
		al2.addAll(al);
		al2.remove(0);
		System.out.println(al2);
		System.out.println(al2.containsAll(al));
		System.out.println(al.set(1, 9000));
		System.out.println(al.get(3));
		System.out.println(al2.indexOf(200));
		System.out.println();
		
		
		
	}
}
