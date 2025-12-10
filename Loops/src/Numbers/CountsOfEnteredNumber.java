package Numbers;

import java.util.Scanner;

public class CountsOfEnteredNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int pcount= 0 , ncount = 0 ,zcount =0;
		char choice;
		do {
			System.out.println("Enter number");
			num = sc.nextInt();
			if(num>0)
				pcount++;
			else if(num<0)
				ncount++;
			else
				zcount++;
			System.out.println("Do you want to enter again? Y/N");
			choice = sc.next().charAt(0);
		} while(choice == 'y'|| choice == 'Y');
		System.out.println("Positive numbers count = " + pcount);
		System.out.println("Negaitive numbers count = " + ncount);
		System.out.println("Zero numbers count = " + zcount);
	}
}
