package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int[] ori_arr = new int[size];
		int[] rev_arr = new int[size];
		
		System.out.println("Enter elements of array");
		for (int i = 0; i < size; i++) {
			ori_arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			rev_arr[i] = ori_arr[size - 1 - i];
		}
		
		System.out.print("Original Marks: ");
		for (int i = 0; i < size; i++) {
			System.out.print(ori_arr[i] + " ");
		}
		
		System.out.println();
		System.out.print("Reversed Marks: ");
		for (int i = 0; i < size; i++) {
			System.out.print(rev_arr[i] + " ");
		}
	}
}
