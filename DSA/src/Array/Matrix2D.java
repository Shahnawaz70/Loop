package Array;
import java.util.Scanner;

public class Matrix2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare a 2-D string array to store the employee names
		String[][] employees = new String[3][4];

		// Read the employee names for each department (HR, IT, Marketing)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				employees[i][j] = sc.next(); // Store each employee's name in the array
			}
		}

		for(int i = 0; i<3; i++) {
            String dept ="";
            if(i == 0)
                dept = "HR";
            else if(i == 1)
                dept = "IT";
            else 
                dept = "Marketing";
            System.out.print("Department " + dept + ": ");
            for(int j = 0; j<4; j++) {
                System.out.print(employees[i][j] + " ");
            }
            System.out.println();
        }

		sc.close();
	}
}