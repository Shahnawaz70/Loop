package Array;

import java.util.Scanner;

public class WaterContainer {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of container");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    int maxArea = findMaxWaterArea(arr);
	    System.out.println(maxArea);
	}
	
	static int findMaxWaterArea(int[] arr) {
	    int left =0;
	    int right = arr.length-1;
	    int maxArea = 0;
	    while(left < right) {
	        int length = Math.min(arr[left], arr[right]);
	        int width = right - left;
	        int area = length * width;
	        if(area > maxArea) {
	            maxArea = area;
	        }
	        if(arr[left] < arr[right]) {
	            left++;
	        } else {
	            right--;
	        }
	    }
	    return maxArea;
	}
}
