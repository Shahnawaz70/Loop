package Numbers;

import java.util.Scanner;

public class RandomNumberGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber;
		int guessNumber;
		int tries = 0;
		randomNumber = (int) (Math.random() * 100) + 1; // get random number between 1 and 100
		System.out.println("Guess My Number Game");
		System.out.println();
		do {
			System.out.println("Enter guess number 1 between 100");
			guessNumber = sc.nextInt();
			tries++;
			
			if (guessNumber > randomNumber) {
				System.out.println("Too high! Try Again");
			} else if (guessNumber < randomNumber) {
				System.out.println("Too low! Try Again");
			} else {
				System.out.println("Correct! You got it in " + tries + " guesses!");
			}
		} while (guessNumber != randomNumber);
	}
}
