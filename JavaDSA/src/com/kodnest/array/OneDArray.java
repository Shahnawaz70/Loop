package com.kodnest.array;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		System.out.print("Array: " + "[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
			sum = sum + arr[i];
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}
