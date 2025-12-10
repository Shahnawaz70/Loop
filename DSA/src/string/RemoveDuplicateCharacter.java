package string;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		// 1st Approach
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);
		
		// 2nd Approach
		
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i+1);
			if(idx == -1) { 
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		// 3rd Approach
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			boolean repeated = false;
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(arr[i]);
			}
			
		}
		System.out.println(sb3);
	}
}
