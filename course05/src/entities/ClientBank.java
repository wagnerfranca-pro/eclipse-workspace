package entities;

public class ClientBank {
	private double accountNumber;
	String accountHolder;
	private double balance;

	public ClientBank(double accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public ClientBank(double accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void removeBalance(double balance) {
		this.balance -= balance + 5;
	}

	public String toString() {
		return String.format("Account %.0f", accountNumber) 
				+ ", " 
				+ accountHolder 
				+ ", "
				+ String.format("Balance: $ %.2f", balance);

	}

}
