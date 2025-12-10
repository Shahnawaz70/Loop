package polymorphism;

public class PlaneApp {
	public static void main(String[] args) {
		Airport.acceptPlane(new CargoPlane()); // Used Anonymous object 
		System.out.println("========================");
		Airport.acceptPlane(new PassengerPlane());
		System.out.println("========================");
		Airport.acceptPlane(new FighterPlane());
	}
}
