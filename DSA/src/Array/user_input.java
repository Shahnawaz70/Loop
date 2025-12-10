package Array;

import java.util.Scanner;

public class user_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		System.out.println("Please enter array element");
		// Array Creation
		int [] arr = new int [n];
		// Array population ... Array user input
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Displaying array elements");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

//array population
//arr[0] = sc.nextInt();
//arr[1] = sc.nextInt();
//arr[2] = sc.nextInt();
//arr[3] = sc.nextInt();