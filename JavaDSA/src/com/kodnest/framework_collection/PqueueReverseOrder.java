package com.kodnest.framework_collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PqueueReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Priority Queue");
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i=0; i<n; i++) {
			pq.add(sc.nextInt());
		}
		pq.add(sc.nextInt());
		pq.poll();
		System.out.println("Updated Priority Queue");
		while(!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
	}
}
