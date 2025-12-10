package sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int[] arr = new int[sc.nextInt()];
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while (j>=0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
