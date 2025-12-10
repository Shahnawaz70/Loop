package Numbers;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		int a , b;
		
		do {
			System.out.println("Enter two numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			int sum = a + b;
			System.out.println(sum);
			System.out.println("Do you want to continue? y /n");
			choice = sc.next().charAt(0);
			
		} while(choice =='y' || choice =='Y');
		
	}
}
