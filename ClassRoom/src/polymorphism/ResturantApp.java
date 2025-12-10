package polymorphism;

public class ResturantApp {
	public static void main(String[] args) {
        Order myOrder = new Order();
        new Resturant().processOrder(myOrder);
    }
}
