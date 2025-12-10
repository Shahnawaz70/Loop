package interfaces;

public class RBIApp {
	public static void main(String[] args) {
		RBI sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.denomation();
		RBI.limit();
	}
}
