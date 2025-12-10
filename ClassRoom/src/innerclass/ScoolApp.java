package innerclass;

public class ScoolApp {
	public static void main(String[] args) {
		School mySchool = new School("Greenwood High");
		School.Classroom mathClass = mySchool.new Classroom(101, "Math");
		School.Classroom scienceClass = mySchool.new Classroom(102, "Science");
		
		mathClass.displayInfo();
		scienceClass.displayInfo();
	}
}
