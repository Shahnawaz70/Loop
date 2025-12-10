package polymorphism;

public class FighterPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Fighter plane is taking off");
	}
	@Override
	void fly() {
		System.out.println("Fighter plane is flying");
	}
	@Override
	void land() {
		System.out.println("Fighter plane is landing");
	}
}
