package polymorphism;

public class Photo extends Media {
	@Override
	public void play() {
        System.out.println("Photo shows with effects");
    }
	
	//Specialized method
    public void applyFilter() {
        System.out.println("Applying filter to photo");
    }
}
