package string;

import java.util.Scanner;

public class FirstNonRepeatCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			boolean unique = true;
			for(int j=0; j<str.length(); j++) {
				if(i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
				}
			}
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
