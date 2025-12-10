package interfaces;

public class SwitchableApp {

	public static void main(String[] args) {
		Switchable light = new Light();
		light.turnOn();
		light.turnOff();
		Switchable fan = new Fan();
		fan.turnOn();
		fan.turnOff();

	}

}
