import java.util.Scanner;
public class Vowel {
	
	    public static void main(String[] args) {
	        // Use Scanner to take user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter any alphabet");
	        char ch = scanner.next().charAt(0);

	        // Check if the character is a vowel or a consonant
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println(ch + " is a vowel.");
	        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            System.out.println(ch + " is a consonant.");
	        } else {
	            System.out.println(ch + " is not a valid alphabet character.");
	        }

	        scanner.close();
	    }
	}

