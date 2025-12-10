package string;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        String input = sc.nextLine();
        String replaced = input.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(replaced);       
    }
}
