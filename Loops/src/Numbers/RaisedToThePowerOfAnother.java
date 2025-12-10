package Numbers;

import java.util.Scanner;

public class RaisedToThePowerOfAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base number");
		int base = sc.nextInt();
		System.out.println("Enter power number");
		int power = sc.nextInt();
		int res = 1;
		for(int i = 1; i<=power; i++) {
			res = res*base;
		}
		System.out.println(+ base +"'s power of " + power + " is = " + res);
	}
}
