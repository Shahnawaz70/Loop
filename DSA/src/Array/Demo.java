package Array;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] names = new String[2][3];
		System.out.println("Enter elements name");
		for(int i =0; i<names.length; i++) {
			for(int j =0; j<names[i].length; j++)  {
				names[i][j] = sc.nextLine();
			}
		}
		System.err.println();
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
		}
	}
}
