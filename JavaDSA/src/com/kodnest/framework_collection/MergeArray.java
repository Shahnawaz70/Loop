package com.kodnest.framework_collection;
import java.util.*;
public class MergeArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size 1st ArrayList");
        int n1 = sc.nextInt();
        ArrayList<String> color1 = new ArrayList<String>();
        for(int i=0; i<n1; i++) {
            color1.add(sc.next());
        }
        System.out.println("Enter the size 2nd ArrayList");
        int n2 = sc.nextInt();
        ArrayList<String> color2 = new ArrayList<String>();
        for(int i=0; i<n2; i++) {
            color2.add(sc.next());
        }
        ArrayList<String> merge = new ArrayList<String>();
        for(int i=0; i<n1; i++) {
            merge.add(color1.get(i));
        }
        for(int i=0; i<n2; i++) {
            merge.add(color2.get(i));
        }

        System.out.print("List of first array: ");
        for(Object x: color1) {
            System.out.print(x + " ");
        }
        System.out.print("\nList of second array: ");
        for(Object y: color2) {
            System.out.print(y + " ");
        }

        System.out.print("\nNew array: ");
        for(Object z: merge) {
            System.out.print(z + " ");
        }
        sc.close();
    }
}
