package interfaces;

public class Fan implements Switchable{

	public void turnOn() {
		
		System.out.println("Fan is turned on with a voice command.");
	}
	
	public void turnOff() {
		System.out.println("Fan is turned off with a voice command.");
		
	}

}
