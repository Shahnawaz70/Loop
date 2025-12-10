package Number;

import java.util.Scanner;

public class FtoCelsious {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		double tem = sc.nextDouble();
		celsius(tem);
	}
	public static void celsius(double f) {
		double c = (f-32) *5/9;
		System.out.println("Fahrenhit in Celsius = " + c);
	}

}
