package com.kodnest.string;

import java.util.Scanner;

public class String_Array_BubbleSort_Desc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input: ["Apple", "Banana", "Cherry", "Date", "Elderberry"]
		System.out.println("Enter array in format [\"A\", \"B\", \"C\"]:");
		String str = sc.nextLine();

		// Remove brackets [ ] and quotes "
		str = str.replace("[", "").replace("]", "").replace("\"", "");

		// Split by comma
		String[] arr = str.split(",");

		// Trim extra spaces
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
		}

		// Sort descending
		bubbleSort(arr);

		// Print output in same format
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print("\"" + arr[i] + "\", ");
			} else {
				System.out.print("\"" + arr[i] + "\"");
			}
		}
		System.out.println("]");
		sc.close();
	}

	// Bubble Sort for Strings (descending order)
	public static void bubbleSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) < 0) { // descending
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}
}
