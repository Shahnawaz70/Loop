package string;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String word = sc.nextLine();
		String[] str = word.split(" ");
		String rev = "";
		for(int i=str.length-1; i>=0; i--) {
			rev += str[i]+ " ";
		}
		System.out.println("Reverse Word: "+ rev);
		
		
	}
}
