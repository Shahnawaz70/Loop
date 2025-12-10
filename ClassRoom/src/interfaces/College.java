package interfaces;

public class College implements Professor {

	@Override
	public void subject() {
		System.out.println("All subjects are being tought here");
		
	}

	@Override
	public void teaching() {
		System.out.println("You can find here quality of teaching");
		
	}

	@Override
	public void classrom() {
		System.out.println("There are many classroom");
		
	}

	@Override
	public void faculty() {
		System.out.println("Every subjects faculty ara sepcialized their own fild");
		
	}

}
