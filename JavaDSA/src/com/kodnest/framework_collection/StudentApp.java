package com.kodnest.framework_collection;

import java.util.HashSet;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Ramu", 502);
		Student s2 = new Student(102, "Ramu", 502);
		Student s3 = new Student(103, "Jamu", 502);
		Student s4 = new Student(104, "Gamu", 502);
		Student s5 = new Student(105, "Lamu", 502);
//		
		HashSet<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		System.out.println(hs);
	}
}
