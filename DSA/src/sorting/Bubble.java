package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(arr));
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<(size-1-i); j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
