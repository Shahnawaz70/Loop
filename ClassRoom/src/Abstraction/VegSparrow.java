package Abstraction;

public final class VegSparrow extends Sparrow {
	private String sparrowVarient;
	public VegSparrow(String sparrowVarient) {
		super("Sparrow");
		this.sparrowVarient = sparrowVarient;
	}
	@Override
	void eat() {
		System.out.println("Veg Sparrow is eating veg");

	}

}
