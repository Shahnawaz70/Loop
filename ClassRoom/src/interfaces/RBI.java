package interfaces;

public interface RBI {
	void withdraw();
	void deposit();
	
	default void denomation() {
		System.out.println("From today 500 and 1000 notes will not be in use");
	}
	static void limit() {
		System.out.println("You can use only Rs 100  note");
	}
	private void displayCash() {
		System.out.println("Only Rs 100 notes is available");
	}
}
