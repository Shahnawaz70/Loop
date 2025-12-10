package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String Array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the element of String Array");
		for(int i=0; i<size; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		for(int i=0; i<= size-2; i++) {
			for(int j =0; j<=(size-2-i); j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
