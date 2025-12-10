package com.kodnest.array;

import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] arr = new int[3][2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the marks of School " +i+" class " + j +" Student " + k );
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Array Contents Are...");
		for(int i=0; i<arr.length; i++) {
			System.out.println("{");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("[");
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println("]");
			}
			System.out.println("}");
		}
		
		sc.close();
	}
}
