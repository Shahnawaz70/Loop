package polymorphism;

public class CargoPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Cargo Plane is Taking Off");
	}
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	@Override
	void land() {
		System.out.println("Cargo plane is landing");
	}
}
