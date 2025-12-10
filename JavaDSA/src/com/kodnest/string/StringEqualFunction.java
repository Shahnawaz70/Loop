package com.kodnest.string;

public class StringEqualFunction {
	public static void main(String[] args) {
		String str1 = "Sourav";
		String str2  = "sourav";
		if(str1.equals(str2))
			System.out.println("Both String are equals");
		else
			System.out.println("Not equal");
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both String are equals");
		else
			System.out.println("Not equal");
	}
}
