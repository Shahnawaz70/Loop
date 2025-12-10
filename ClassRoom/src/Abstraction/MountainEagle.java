package Abstraction;

public final class MountainEagle extends Eagle {
	public MountainEagle(String eagleVarient) {
		super("Eagle");
		this.eagleVarient = eagleVarient;
	}
	private String eagleVarient;
	@Override
	void eat() {
		System.out.println("Moutain Eagle hunting");

	}

}
