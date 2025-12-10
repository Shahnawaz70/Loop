package com.kodnest.array;

import java.util.Scanner;

public class SumOfMinimumElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size 2D Array");
		int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
		System.out.println("Enter the elements of 2D Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int min;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i][0];
			System.out.println("Minimum of row " + (i + 1) + ": " + min);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			sum = sum + min;
		}
		System.out.println("Sum of minimum elements: " + sum);
	}
}
