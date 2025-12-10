package interfaces;

public interface BankService {
	public void deposit(double amount);
    public void withdraw(double amount);
    public double checkBalance();
    public void transfer(double amount, String toAccount);
}
