package string;

import java.util.Scanner;

public class CountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		System.out.println("Words count: " + words.length);
	}
}
