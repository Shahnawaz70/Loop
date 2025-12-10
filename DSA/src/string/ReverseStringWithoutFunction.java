package string;

import java.util.Scanner;

public class ReverseStringWithoutFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String inputString = sc.nextLine();
		char[] charArray = inputString.toCharArray();
		String arr ="";
		for(int i =0; i<charArray.length; i++) {
			arr = arr + charArray[charArray.length-1-i];
		}
		System.out.println("Reversed String: " + arr);
	}
}
