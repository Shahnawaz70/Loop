package Number;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int temp = number;
        int rev = 0;
        while(number > 0){
            int digit = number % 10;
            rev = rev *10 + digit;
            number = number / 10;
        }
        if(temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
