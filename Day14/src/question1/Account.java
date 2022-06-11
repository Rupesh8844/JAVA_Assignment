package question1;

public class Account {
String accountNumber;
double balance;

public Account(String accountNumber) {
	super();
	this.accountNumber = accountNumber;
}



	public void deposit(double amount) {
		this.balance = amount;
	}
	

	public double withdraw(double amount) throws InsufficientFundsException {
		if(amount<=balance) {
			this.balance = balance-amount;
			return balance;
		}else {
			InsufficientFundsException ie = new InsufficientFundsException("Insufficient Balance");
			throw ie;
		}
		
	}
	
	public Account() {
		
	}
	
}
