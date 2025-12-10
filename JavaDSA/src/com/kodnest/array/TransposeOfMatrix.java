package com.kodnest.array;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D Array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		System.out.println("Enter 2D arrays elements");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Original Matrix:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] transpose = new int[col][row];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transpose[j][i]= arr[i][j];
			}
		}
		System.out.println("Transpose of the Matrix:");
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
