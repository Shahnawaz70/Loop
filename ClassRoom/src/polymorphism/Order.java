package polymorphism;

public class Order {
	public void prepare() {
        System.out.println("Order is being prepared!");
    }
    public void serve() {
        System.out.println("Order served to the customer!");
    }
    public void bill() {
        System.out.println("Bill prepared for the order!");
    }
}
