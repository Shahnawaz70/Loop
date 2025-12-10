package Abstraction;

public final class SerpantEagle extends Eagle {
	private String eagleVarient;
	public SerpantEagle(String eagleVarient) {
		super("Eagle");
		this.eagleVarient = eagleVarient;
	}

	@Override
	void eat() {
		System.out.println("Serpant Eagle is eating Sumaiya");

	}

}
