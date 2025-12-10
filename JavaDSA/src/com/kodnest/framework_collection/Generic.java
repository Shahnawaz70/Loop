package com.kodnest.framework_collection;

public class Generic <T>{
	public T a;
	public T b;
	
	<A> void display(A x, A y) {
		System.out.println(x  + " " + y);
	}
}
