package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {70, 90, 20, 60, 50, 10};
		int n = a.length;
		
		System.out.println("Oroginal Array: " + Arrays.toString(a));
		
		for(int i=0; i<= n-2; i++) {
			for(int j =0; j<= (n-2-i); j++) {
				if(a[i] > a[j+i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
}
