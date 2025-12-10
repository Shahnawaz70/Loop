package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the elements of Array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements which you want to search");
		System.out.println("Original Array: " + Arrays.toString(arr));
		int key = sc.nextInt();
		int left =0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] == key) {
				System.out.println("Element found at index " + mid);    
				return;
			} else if(key < arr[mid])
				right = mid-1;
			else if(key > mid)
				left =  mid +1;
		}
		System.out.println("Element not found");
	}
}
