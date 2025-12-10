package Typecasting;

public class ApplianceApp {
	public static void main(String[] args) {
        Appliance myBlender = new Blender(); // Upcasting
        Appliance myMicrowave = new Microwave(); // Upcasting
        myBlender.turnOn();
        myMicrowave.turnOn();
    }
}
