package Number;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        int smallest = 9;
        int temp = number;
        // Find and print the smallest digit in the number
        while(number > 0) {
            int digit = number % 10;
            if(digit < smallest) {
                smallest = digit;
            }
            number = number /10;
        }
        System.out.println("The smallest digit in " + temp + " is " + smallest + ".");
    }
}
