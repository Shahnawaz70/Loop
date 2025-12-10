package interfaces;

public class Main {
	public static void main(String[] args) {
        BankService citiBank = new CitiBank();
        BankService chaseBank = new ChaseBank();
        testBankOperations(citiBank, 500, 300, 100, "12345ABC");
        testBankOperations(chaseBank, 500, 300, 100, "12345DEF");
    }
	
	public static void testBankOperations(BankService bank, double deposit, double withdraw, double transfer, String transferTo) {
        bank.deposit(deposit);
        bank.withdraw(withdraw);
        bank.checkBalance();
        bank.transfer(transfer, transferTo);
    }
}
