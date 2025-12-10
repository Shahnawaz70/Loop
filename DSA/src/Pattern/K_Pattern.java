package Pattern;

public class K_Pattern {
	public static void main(String[] args) {
		for(int r=1; r<=7; r++) {
			for(int c=1; c<=4; c++) {
				if((c == 1 || r + c ==5) || (r > 4 && r - c ==3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
