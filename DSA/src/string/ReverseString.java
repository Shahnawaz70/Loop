package string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		String reverseString = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reverse String: " + reverseString);
	}
}
