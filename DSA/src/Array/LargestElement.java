package Array;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int largest = arr[0];
		System.out.println("Enter elements");
		for(int i =0; i<size; i++) {
			arr[i] = sc.nextInt();
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Element : " + largest);
	}
}
