package polymorphism;

public class Video extends Media {
	@Override
	public void play() {
        System.out.println("Video plays with animation");
    }
	
	//Specialized method
    public void adjustQuality() {
        System.out.println("Adjusting video quality settings");
    }
}
