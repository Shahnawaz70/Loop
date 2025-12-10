package Abstraction;

public final class NonVegSparrow extends Sparrow {
	private String sparrowVarient;
	public NonVegSparrow(String sparrowVarient) {
		super("Sparrow");
		this.sparrowVarient = sparrowVarient;
	}	
	@Override
	void eat() {
		System.out.println("Non Veg Sparrow is eating non veg");

	}

}
