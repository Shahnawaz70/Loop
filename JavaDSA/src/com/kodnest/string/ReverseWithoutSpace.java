package com.kodnest.string;

import java.util.Scanner;

public class ReverseWithoutSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] revArr = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ' ')
				revArr[i] =' ';
		}
		int index =0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] == ' ')
				continue;
			if(revArr[index] == ' ')
				index++;
			revArr[index] = arr[i];
			index++;
		}
		String rev = new String(revArr);
		System.out.println("Original Array: " + str);
		System.out.println("Reversed Array: " + rev);
		sc.close();
	}
}
