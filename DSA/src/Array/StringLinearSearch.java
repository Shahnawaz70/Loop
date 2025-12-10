package Array;

import java.util.Scanner;

public class StringLinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter size of array");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		System.out.println("Enter names");
		for(int i =0; i<size; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("Enter the name you want to search");
		String key = sc.nextLine();
//		boolean found = false;
		for(int i=0; i<size; i++) {
			if(arr[i].equals(key)) { // Equals used for String comparison 
				System.out.println("Found name at index " + i);
//				found = true;
//				break;
				return;
			}
		}
//		if(found == false)
			System.out.println("Not found");
		sc.close();
	}
}
