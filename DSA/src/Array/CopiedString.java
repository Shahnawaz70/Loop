package Array;

import java.util.Scanner;

public class CopiedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String inputString = sc.nextLine();
		char[] chararray = inputString.toCharArray();
		String copiedString ="";
		for(int i =0; i<chararray.length; i++) {
			copiedString = copiedString + chararray[i];
		}
		System.out.println("CopiedString: " + copiedString);
	}
}
