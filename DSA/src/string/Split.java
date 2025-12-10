package string;

public class Split {
	public static void main(String[] args) {
		String skill ="Java,pythin,HTML,CSS,MySQL";
		String[] skillArr = skill.split(",");
		System.out.println("Skills");
		for(int i=0; i<skillArr.length; i++) {
			System.out.println(skillArr[i]);
		}
	}
}
