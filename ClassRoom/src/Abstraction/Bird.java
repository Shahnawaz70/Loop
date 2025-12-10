package Abstraction;

public abstract class Bird {
	String species;
	
	public Bird(String species) {
		this.species = species;
	}
	abstract void eat();
	abstract void fly();
	abstract void sleep();
}
