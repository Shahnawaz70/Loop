package string;

public class functions {
	public static void main(String[] args) {
		String s = "Welcome to KODNEST";
		System.out.println("It returns length of a String = " + s.length());
		System.out.println("It returns all string character to Upper sace: " + s.toUpperCase());
		System.out.println("TIt returns all string character to lower sace " + s.toLowerCase());
		System.out.println("Contains (\"KODNEST\") : It returns ture or False" + s.contains("KODNEST"));
		System.out.println("It return only single character of given index number " + s.charAt(0));
		System.out.println("It conncat " + s.concat("Java"));
	}
}
