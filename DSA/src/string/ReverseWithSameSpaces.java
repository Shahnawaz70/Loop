package string;

import java.util.Scanner;

public class ReverseWithSameSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		char[] r = new char[s.length];
		// copying spaces
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ')
				r[i] = ' ';
		}
		// reversing
		int idx = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			if (s[i] == ' ')
				continue;
			if (r[idx] == ' ')
				idx++;
			r[idx] = s[i];
			idx++;
		}
		String rev = new String(r);
		System.out.println("Reversed String: " + rev);
	}
}
