package com.kodnest.hashCode_equals;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;

public class CarApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of HashSet");
		int n = sc.nextInt();
		HashSet<Car> cars = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
            String model = sc.next();
            int year = sc.nextInt();
            Car car = new Car(model, year);
            cars.add(car);
        }
		
		System.out.println("Unique cars in the HashSet:");
		for(Car c : cars) {
			System.out.println(c);
		}
	}
}
