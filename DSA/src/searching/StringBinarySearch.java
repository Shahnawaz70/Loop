package searching;

import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		String key = sc.next();
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int result = key.compareTo(arr[mid]);
			if (key.equals(arr[mid])) {
				System.out.println("Student Found");
				return;
			} else if (result < 0)
				right = mid - 1;
			else if (result > 0)
				left = mid + 1;
		}
		System.out.println("Student Not Found");
	}
}
