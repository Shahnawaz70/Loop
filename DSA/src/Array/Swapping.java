package Array;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// write your code here

		int numberOfPlayes = sc.nextInt();

		int[] playerScores = new int[numberOfPlayes];

		for (int i = 0; i < numberOfPlayes; i++) {
			playerScores[i] = sc.nextInt();
		}

		int a = sc.nextInt();
		int b = sc.nextInt();

		int temp = playerScores[a];
		playerScores[a] = playerScores[b];
		playerScores[b] = temp;

		System.out.print("Updated Scores: ");
		for (int i = 0; i < numberOfPlayes; i++) {
			System.out.print(playerScores[i] + " ");
		}

	}
}
