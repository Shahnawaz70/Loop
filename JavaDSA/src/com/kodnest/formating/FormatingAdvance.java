package com.kodnest.formating;

import java.util.Scanner;
import java.text.MessageFormat;
public class FormatingAdvance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter product name and Price");
//		String prodcutName = sc.next();
//		String date = sc.next();
//		double price = sc.nextDouble();
//		String productDetails = String.format("Product Name %s | Price ₹%,.2f",prodcutName, price);
//		System.out.println(productDetails);
		
		
		System.out.println("Enter Name, Date and Bank Balance");
		String name = sc.next();
		String date = sc.next();
		double balance = sc.nextDouble();
		String formattedMessage = MessageFormat.format("Hello, {0}, your account balance as of {1}, is ₹{2}",name,date,balance);
		System.out.println(formattedMessage);
		sc.close();
		
	}
}
