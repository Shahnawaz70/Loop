package Array;

import java.util.Scanner;

public class IndexAccurance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accept number 'n' from the user
		System.out.print("Enter the number to find (n): ");
		int n = scanner.nextInt();

		// Accept the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Declare the array
		int[] arr = new int[size];

		// Accept the elements of the array
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		// Find the first occurrence of 'n'
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i] == n) {
				index = i;
				break; // Stop at the first match
			}
		}

		// Print the result
		System.out.println("Index of first occurrence of " + n + ": " + index);

		scanner.close();
	}
}
