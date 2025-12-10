package string;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabaticString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		//1st Approach without using sort method
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(new String(arr));
		
		//2nd Method using sort method
		
		char[] arr1 = str.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));
	}
}
