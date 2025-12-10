package com.kodnest.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// HashMap to store employee data (ID -> Name)
		HashMap<Integer, String> employees = new HashMap<>();

		// Step 1: Add employees
		int n = sc.nextInt(); // number of employees to add
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			employees.put(id, name);
			System.out.println("Added: ID " + id + " -> " + name);
		}

		// Step 2: Retrieve employee by ID
		int retrieveId = sc.nextInt();
		if (employees.containsKey(retrieveId)) {
			System.out.println("Employee found: " + employees.get(retrieveId));
		} else {
			System.out.println("Employee not found.");
		}

		// Step 3: Remove employee by ID
		int removeId = sc.nextInt();
		if (employees.containsKey(removeId)) {
			String removedName = employees.remove(removeId);
			System.out.println("Employee removed: " + removedName);
		} else {
			System.out.println("Employee not found.");
		}

		// Step 4: Print all employees
		employees.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));

		sc.close();

	}
}
