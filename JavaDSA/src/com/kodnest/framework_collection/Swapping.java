package com.kodnest.framework_collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
	    int n = sc.nextInt();
	    ArrayList<String> arr = new ArrayList<String>();
	    for(int i=0; i<n; i++) {
	        arr.add(sc.next());
	    }
	    
	    System.out.println("Array list before Swap:");
	    for(Object x: arr) {
	        System.out.println(x);
	    }
	    String temp = arr.get(0);
	    arr.set(0, arr.get(2));
	    arr.set(2, temp);
	    System.out.println("Array list after Swap:");
	    for(Object x : arr) {
	        System.out.println(x);
	    }
	    sc.close();
	}
}
