package sorting;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st Array");
		int[] arr1 = new int[sc.nextInt()];
		System.out.println("Enter the elements of first Array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of 2nd Array");
		int[] arr2 = new int[sc.nextInt()];
		System.out.println("Enter the elements of second Array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] mergedArr = new int[arr1.length + arr2.length];

		mergeArray(arr1, arr2, mergedArr);
		bubbleSort(mergedArr);
		for (int x : mergedArr) {
			System.out.print(x + " ");
		}
	}

	static int[] mergeArray(int[] arr1, int[] arr2, int[] mergedArr) {

		for (int i = 0; i < arr1.length; i++) {
			mergedArr[i] = arr1[i];
		}
		int j = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			mergedArr[j] = arr2[i];
			j++;
		}

		return mergedArr;
	}

	static void bubbleSort(int[] mergedArr) {
		int n = mergedArr.length;
		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= n - 2 - i; j++) {
				if (mergedArr[j] > mergedArr[j + 1]) {
					int temp = mergedArr[j];
					mergedArr[j] = mergedArr[j + 1];
					mergedArr[j + 1] = temp;
				}
			}
		}
	}
}
