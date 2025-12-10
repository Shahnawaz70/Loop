package string;

import java.util.Scanner;

public class DuplicateCharacterOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int count =1;
		for(int i=1; i<=str.length(); i++) {
			if(i < str.length() && str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(str.charAt(i-1)).append(count);
				count =1;
			}
		}
		System.out.println(sb.toString());
	}
}
