package sorting;

import java.util.Scanner;

public class CorrespondingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String lines1 = sc.nextLine().replaceAll("\\[|\\]|,", " ").trim();
		String[] parts1 = lines1.split("\\s+");
		int[] arr1 = new int[parts1.length];
		for(int i=0; i<parts1.length; i++) {
			arr1[i] = Integer.parseInt(parts1[i]);
		}
		
		System.out.println("Enter the string");
		String lines2 = sc.nextLine().replaceAll("\\[|\\]|,", " ").trim();
		String[] parts2 = lines2.split("\\s+");
		int[] arr2 = new int[parts2.length];
		for(int i=0; i<parts2.length; i++) {
			arr2[i] = Integer.parseInt(parts2[i]);
		}
		int[] mergeArray = new int[Math.min(arr1.length, arr2.length)];
        for (int i = 0; i < mergeArray.length; i++) {
            mergeArray[i] = arr1[i] + arr2[i];
        }
		
		for(int i=0; i<=mergeArray.length-2; i++) {
			for(int j=0; j<=mergeArray.length-2-i; j++) {
				if(mergeArray[j] >mergeArray[j+1]) {
					int temp = mergeArray[j];
					mergeArray[j] = mergeArray[j+1];
					mergeArray[j+1] = temp;
				}
			}
		}
		System.out.print("[");
		int count =0;
		for(int x: mergeArray) {
			System.out.print(x);
			count++;
			if(count<mergeArray.length)
				System.out.print(", ");
		}
		System.out.println("]");
		
	}
}
