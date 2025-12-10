package com.kodnest.string;

public class StringFunction {
	public static void main(String[] args) {
		String str1 = "Sachin";
		String str2 = "Sourav";
		int res = str1.compareTo(str2);
		
		if(res > 0) {
			System.out.println(res);
			System.out.println(str1 + "String is greater");
		}
		else if(res < 0) {
			System.out.println(res);
			System.out.println(str2 + "String is greater");
		}
		else {
			System.out.println("String are equal");
		}
	}
			
}
