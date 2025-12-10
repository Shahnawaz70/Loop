package com.kodnest.framework_collection;
import java.util.*;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList stack = new LinkedList();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.add(null);
		System.out.println(stack.indexOf(200));
		
		System.out.println(stack);
		Iterator itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Pop: " + stack.pop());
	}
}
