package interfaces;

public class AnimalRef {
	public static void aceeptRef(Animal a) {
		a.makeSound();
		a.eat();
		a.sleep();
	}
}
