package com.kodnest.comparable;

public class Product implements Comparable<Product> {
	private int id;
	private String productName;
	private int productPrice;
	private int stock;
	
	 public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String productName, int productPrice, int stock) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getStock() {
		return stock;
	}

	public String toString() {
		return "(Product Name= " + productName + ", Stock=" + stock + ")";
	}
	
	public int compareTo(Product ref) {
		
//		return Integer.compare(this.stock, ref.stock);
		if(this.stock < ref.stock)
			return 1;
		else if(this.stock < ref.stock)
			return -1;
		else 
			return 0;
	}
}
