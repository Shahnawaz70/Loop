package polymorphism;

public class Airport {
	
	//Flexible code
	public static void acceptPlane(Plane ref) { // Plane class object ref called here
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
