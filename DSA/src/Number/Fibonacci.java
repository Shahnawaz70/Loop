package Number;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        
        int firstNumber = 0;
        int secondNumber =1;
        System.out.print("Fibonacci series up to " + number + ": ");
        while(firstNumber <= number) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
