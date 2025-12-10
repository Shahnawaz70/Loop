package Array;

import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,30,40,50,50};
		System.out.println(checkingSortedArray(arr));
	}
	public static boolean checkingSortedArray(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] >= arr[i-1]) {
				
			}
			else {
				return false;
			}
				
		}
		return true;
	}
}
