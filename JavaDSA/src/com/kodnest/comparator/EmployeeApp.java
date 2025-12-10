package com.kodnest.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array List");
		int n = sc.nextInt();
		ArrayList<Employee> al = new ArrayList<Employee>();
		for(int i=0; i<n; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			String designation = sc.next();
			int salary = sc.nextInt();
			double experience = sc.nextDouble();
			Employee e = new Employee(name, id, designation, salary, experience);
			al.add(e);
		}
		System.out.println(al);
		
		
		// Lambda Expression	
		Comparator<Employee> com1 = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
		Collections.sort(al,com1);
		System.out.println(al);
		
		Comparator<Employee> com2 = (o1, o2) -> Double.compare(o1.getId(), o2.getId());
		Collections.sort(al,com2);
		System.out.println(al);
		
		Comparator<Employee> com3 = (o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary());
		Collections.sort(al,com3);
		System.out.println(al);
		
		Comparator<Employee> comp = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId()> o2.getId())
					return 1;
				else if(o1.getId()< o2.getId())
					return -1;
				else 
					return 0;
			}
			
			
		};	
		Collections.sort(al,comp);
		System.out.println(al);
		
		
		// Anonymous Object  
		Comparator<Employee> comp2 = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getExperience()> o2.getExperience())
					return 1;
				else if(o1.getExperience()< o2.getExperience())
					return -1;
				else 
					return 0;
			}
			
		};
		Collections.sort(al,comp2);
		System.out.println(al);
		
		Comparator<Employee> comp3 = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()> o2.getSalary())
					return 1;
				else if(o1.getSalary()< o2.getSalary())
					return -1;
				else 
					return 0;
			}
			
		};
		Collections.sort(al,comp3);
		System.out.println(al);
	}
}
