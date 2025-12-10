package polymorphism;

public class MediaApp {

	public static void main(String[] args) {
		
		Media mediaVideo = new Video();
        Media mediaPhoto = new Photo();

        mediaVideo.play();
        mediaPhoto.play();
        
        //Downcasting 
        if (mediaVideo instanceof Video) {
            ((Video) mediaVideo).adjustQuality();
        }


        if (mediaPhoto instanceof Photo) {
            ((Photo) mediaPhoto).applyFilter();
        }

	}

}
