package Array;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] arr = new double[5];
        System.out.println("Enter elements");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
