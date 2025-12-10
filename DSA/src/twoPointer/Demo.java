package twoPointer;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int key = 40;
		int left = 0;
		int right = arr.length-1;
		int iteration =1;
		while(left <= right) {
			System.out.println("Iteration: " + iteration);
			if(key == arr[left] || key == arr[right]) {
				System.out.println("Key found");
				return;
			}
			left++;
			right--;
			iteration++;
		}
		System.out.println("Not found");
	}
}
