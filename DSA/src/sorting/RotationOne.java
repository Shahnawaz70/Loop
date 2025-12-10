package sorting;

import java.util.Scanner;

public class RotationOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the element");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] rotatedArr = new int[arr.length];
		rotatedArr[0] = arr[arr.length-1];
		
		for(int i=0; i<=rotatedArr.length-2; i++) {
			rotatedArr[i+1] = arr[i];
		}
		for(int x: rotatedArr) {
			System.out.print(x + " ");
		}
	}
}
