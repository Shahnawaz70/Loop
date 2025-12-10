package com.kodnest.framework_collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Vector_Stack_Legacy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Vector");
		int n = sc.nextInt();
		Vector v = new Vector();
		for(int i=0; i<n; i++) {
			v.add(sc.nextInt());
		}
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println("====================");
		System.out.println("Enter the size of Stack");
		int num = sc.nextInt();
		Stack s = new Stack();
		for(int i=0; i<num; i++) {
			s.add(sc.nextInt());
		}
		
		e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement() + " ");
		}
		
	}
}
