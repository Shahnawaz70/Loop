package Array;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int slargest = -1;
		System.out.println("Enter elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		for(int i=0; i<size; i++) {
			if(arr[i] > largest) {
				slargest = largest;
				largest = arr[i];
			} else if(arr[i] < largest && arr[i] >slargest) {
				slargest = arr[i];
			}
				
			
		}
		System.out.println("Second Largest element = "+slargest);
	}
}
