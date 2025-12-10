package Abstraction;

public abstract class Sparrow extends Bird {
	private String type;
	public Sparrow(String type) {
		super("Bird");
		this.type = type;
	}

	@Override
	void fly() {
		System.out.println("Sparrow is flying on low hight");

	}

	@Override
	void sleep() {
		System.out.println("Sparrow sleeps on small plants");

	}

}
