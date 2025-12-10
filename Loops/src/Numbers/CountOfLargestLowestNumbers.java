package Numbers;

import java.util.Scanner;

public class CountOfLargestLowestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		char choice;
		do {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if(num > max)
				max = num;
			if(num < min)
				min = num;
			System.out.println("Do you wan to continue y/n");
			choice = sc.next().charAt(0);
		} while(choice == 'y' || choice == 'Y');
		System.out.println("Maximum number " + max);
		System.out.println("Minimum number " + min);

	}

}
