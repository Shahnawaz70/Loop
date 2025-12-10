package Abstraction;

public abstract class Eagle extends Bird {
	private String type;
	
	 public  Eagle(String type) {
		 super("Bird");
		 this.type = type;
	 }
	 void fly() {
		System.out.println("Eagle is flying high");
	}
	 void sleep() {
		System.out.println("Eagle sleeps on big tree");
	}
}
