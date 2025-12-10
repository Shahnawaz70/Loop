package com.kodnest.array;

import java.util.Scanner;

public class Jagged3DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][][] banks = new String[3][][];
		banks[0]= new String[3][];
		banks[0][0] = new String[4];
		banks[0][1] = new String[3];
		banks[0][2] = new String[2];
		
		banks[1]= new String[2][];
		banks[1][0] = new String[2];
		banks[1][1] = new String[6];
		
		banks[2]= new String[5][];
		banks[2][0] = new String[3];
		banks[2][1] = new String[3];
		banks[2][2] = new String[1];
		banks[2][3] = new String[2];
		banks[2][4] = new String[7];
		
		for(int i=0; i<banks.length; i++) {
			for(int j=0; j<banks[i].length; j++) {
				for(int k=0; k<banks[i][j].length; k++) {
					System.out.println("Enter Bank " + i + " Branches " + j + " Customers Name " + k);
					banks[i][j][k] = sc.next();
				}
			}
		}
		
		System.out.println("Array Contents Are....");
		for(int i=0; i<banks.length; i++) {
			for(int j=0; j<banks[i].length; j++) {
				System.out.print("[");
				for(int k=0; k<banks[i][j].length; k++) {
					System.out.print(banks[i][j][k] + " ");
				}
				System.out.print("]");
			}
			System.out.println();
		}
		sc.close();		
	}
	
}
