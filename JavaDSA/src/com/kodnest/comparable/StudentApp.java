package com.kodnest.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
		int n = sc.nextInt();
		ArrayList al = new ArrayList();
		
		for(int i=0; i<n; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			Student s = new Student(name, id);
			al.add(s);
		}
		
		Collections.sort(al);
		System.out.println(al);
	}
}
