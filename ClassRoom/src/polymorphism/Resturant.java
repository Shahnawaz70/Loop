package polymorphism;

public class Resturant {
	public void processOrder(Order order) {
        order.prepare();
        order.serve();
        order.bill();
    }
}
