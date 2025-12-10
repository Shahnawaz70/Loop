package innerclass;

public class MathOperationLambdaApp {
	public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
