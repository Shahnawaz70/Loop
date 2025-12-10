package string;

import java.util.Scanner;

public class CharacterReplaceOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.next();
		System.out.println("Enter charcter that you want occurance");
		char ch = sc.next().charAt(0);
		if(input.indexOf(ch) == -1) {
			System.out.println("Given character is not Available in input string");
			System.exit(0);
		}
		
		int count=1;
		for(int i=0; i<input.length(); i++) {
			char arr = input.charAt(i);
			if(arr == ch) {
				input = input.replaceFirst(String.valueOf(ch), String.valueOf(count));
				count++;
				
			}
		}
		System.out.println(input);
	}
}
