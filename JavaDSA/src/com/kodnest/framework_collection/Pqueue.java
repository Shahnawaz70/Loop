package com.kodnest.framework_collection;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Pqueue {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        for(int i=0; i<n; i++) {
	            pq.add(sc.nextInt());
	        }
	        pq.add(sc.nextInt());
	        pq.poll();
	        System.out.println("Updated Queue of Task Priorities:");
	        while(!pq.isEmpty()) {
	            System.out.print(pq.poll() + " ");
	        }
	        sc.close();
	    }
}
