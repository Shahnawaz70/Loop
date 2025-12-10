package Recursion;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of integer array");
		int[] nums = new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scan.nextInt();
		}
		System.out.println("Enter the target");
		int target = scan.nextInt();
		int output = solution(nums,0,nums.length-1,target);
		if(output==0) {
			System.out.println("The target is not found");
		} else {
			System.out.println("The target is found on " + output + " position.");
		}
		
	}
	public static int solution(int[] nums, int s, int e, int target) {
		if(s>e) {
			return 0;
		}
		int mid = s+(e-s)/2;
		if(nums[mid]==target) {
			return mid+1;
		}
		if(nums[mid]>target) {
			return solution(nums,s,mid-1,target);
		} else {
			return solution(nums,mid+1,e,target);
		}
	}
}
