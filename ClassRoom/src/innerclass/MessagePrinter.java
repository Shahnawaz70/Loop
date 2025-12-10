package innerclass;

public class MessagePrinter {
	void printMessage(String message) {
		class Printer {
			void display() {
				System.out.println("Message: " + message);
			}
		}

		Printer printer = new Printer();
		printer.display();
	}
}
