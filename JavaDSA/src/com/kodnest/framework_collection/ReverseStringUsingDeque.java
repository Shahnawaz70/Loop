package com.kodnest.framework_collection;

import java.util.ArrayDeque;
import java.util.Scanner;

	public class ReverseStringUsingDeque {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read the input string
	        String s = sc.next();

	        // Use ArrayDeque to store characters
	        ArrayDeque<Character> deque = new ArrayDeque<>();

	        // Add characters to deque
	        for (char c : s.toCharArray()) {
	            deque.add(c);
	        }

	        // Build reversed string
	        StringBuilder reversed = new StringBuilder();
	        while (!deque.isEmpty()) {
	            reversed.append(deque.removeLast()); // remove from end
	        }

	        // Print result
	        System.out.println(reversed.toString());
	    }
	}


