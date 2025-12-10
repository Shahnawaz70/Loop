package interfaces;

public class AnimalApp {
	public static void main(String[] args) {
		AnimalApp a = new AnimalApp();
		Animal t = new Tiger();
		Animal d = new Dog();
		AnimalRef.aceeptRef(t);
		AnimalRef.aceeptRef(d);
	}
	
}
