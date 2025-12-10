package com.kodnest.array;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of classes (1st D length)");
		int[][] arr = new int[sc.nextInt()][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the no of students in class " + i + " (that is 2nd D length of 1st D ) " + i);
			arr[i] = new int[sc.nextInt()];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of class " + i + " Studnets " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array Contents Are..");
		for(int i=0; i<arr.length; i++) {
			System.out.println("[");
			for(int j=0; j<arr.length; j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println("]");
			System.out.println();
		}
		sc.close();
	}
}
