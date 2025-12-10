package Array;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number");
		int row = sc.nextInt();
		System.out.println("Enter column number");
		int col = sc.nextInt();
		sc.nextLine();
		String [][] names = new String[row][col];
		System.out.println("Enter array element");
		for(int i=0; i< row; i++) {
			for(int j=0; j<col; j++) {
				names[i][j] = sc.nextLine();
			}
		}
		

		for(int i=0; i< row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(names[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
