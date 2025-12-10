package Number;

import java.util.Scanner;

public class NEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		System.out.println("The first \" + n + \" even numbers are:");
		for(int i=1; i<=n; i++) {
			System.out.println(2*i);
		}
	}
}
