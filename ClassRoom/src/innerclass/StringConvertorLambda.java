package innerclass;

public class StringConvertorLambda {
	public static void main(String[] args) {
        StringConverter toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.convert("hello, world!"));
    }
}
