package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Enter the Array Elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		for(int x: arr) {
			System.out.print(x + " ");
		}
		
//		System.out.println("Original Array: " + Arrays.toString(arr));
//		for(int i=0; i<arr.length-1; i++) {
//			int minIndex = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j] < arr[minIndex]) {
//					minIndex = j;					
//				}
//			}
//			
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[i];
//			arr[i] = temp;
//			
//		}
//		System.out.println("Selection Sort Array: " + Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int smallest =i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest] > arr[j])
					smallest = j;
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
}
