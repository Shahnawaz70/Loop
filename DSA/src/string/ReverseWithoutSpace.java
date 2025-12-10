package string;

import java.util.Scanner;

public class ReverseWithoutSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String rev ="";
        for(int i =0; i<words.length; i++) {
            String temp = words[i];
            temp = reverse(temp);
            rev = rev + temp +" ";
        }
        System.out.println("Reversed String: " + rev);
    }
    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        return rev;
    }
}
