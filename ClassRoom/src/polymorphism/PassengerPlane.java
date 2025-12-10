package polymorphism;

public class PassengerPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Passenger plane is taking off");
	}
	@Override
	void fly() {
		System.out.println("Passenger plane is flying");
	}
	@Override
	void land() {
		System.out.println("Passenger plane is landing");;
	}
}
