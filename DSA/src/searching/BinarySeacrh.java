package searching;

public class BinarySeacrh {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int key = 80;
		int left =0;
		int right = arr.length-1;
		int mid = (left + right)/2;
		
		while(left <= right) {
			if(key == arr[mid]) {
				System.out.println("Key found");
				return;
			}
			else if(key < arr[mid]) {
				right = mid-1;
			}
			else if (key > arr[mid]) {
				left = mid +1;
			}
			mid = (left+right)/2;
		}
		System.out.println("Key not found");
	}
}