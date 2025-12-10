package Number;

import java.util.Scanner;

public class SumOfSingleDigit {
	public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        
        // Calculate the sum of digits until it becomes a single-digit number
        int temp = number;
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            if(number == 0 && sum >= 10) {
                number = sum;
                sum = 0;
            }
        }
        System.out.println("The single-digit sum of digits of " + temp + " is " + sum + ".");
    }
}
