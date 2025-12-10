package sorting;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int index=0;
		int min = arr[index];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println("Minimum element " + min + " found at index number " + index);
		sc.close();
	}
}
