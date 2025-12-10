package com.kodnest.hashCode_equals;

import java.util.*;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of HashSet");
		int n = sc.nextInt();
		HashSet<Product> products = new HashSet<>();
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int price = sc.nextInt();
			Product p = new Product(id, name, price);
			products.add(p);
		}
		
		System.out.println("Product Details");
		for(Product pro : products) {
			System.out.println(pro);
		}
	}
}
