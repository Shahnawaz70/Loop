package Array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element you want to find");
		int key = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Element found at index " + i);
				found = true;
				break;
			}
		}
		if (found == false)
			System.out.println("Element not found");
	}
}
