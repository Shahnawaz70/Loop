package Abstraction;

public class BirdApp {

	public static void main(String[] args) {
		
		Birds.accept(new SerpantEagle("SerpantEagel"));
		Birds.accept(new MountainEagle("MountainEagle"));
		Birds.accept(new VegSparrow("VegSparrow"));
		Birds.accept(new NonVegSparrow("NonVegSparrow"));
	}

}
