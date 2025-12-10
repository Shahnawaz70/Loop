package slidingWindow;

import java.util.Scanner;

public class MaximumSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr");
		int[] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the window silde size");
		int k =sc.nextInt();
		int sum = maxSum(arr, k);
		System.out.println("Maximum Sum is = " + sum);
	}
	public static int maxSum(int[] arr, int k) {
		int windowSum =0;
		for(int i=0; i<k; i++) {
			windowSum += arr[i];
		}
		int maxSum = windowSum;
		for(int i=k; i<arr.length; i++) {
			windowSum += arr[i] - arr[i-k];
			if(windowSum > maxSum) {
				maxSum = windowSum;
			}
		}
		return maxSum;
	}
}
