package Typecasting;

public class PaymentAppapp {
	public static void main(String[] args) {
        PaymentApp upi = new Upi();
        upi.pay();

        PaymentApp wal = new Wallet();
        wal.pay();

        PaymentApp card = new Card();
        card.pay();
    }
}
