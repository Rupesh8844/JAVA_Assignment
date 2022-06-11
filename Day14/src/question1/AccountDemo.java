package question1;

public class AccountDemo {

	public static void main(String[] args) {
	
		Account a = new Account("85749612451");
        a.deposit(15000.0);
         
		try {
			
//			double d1 = a.withdraw(6000.0);   //without exception
			
			double d2 = a.withdraw(20000.0);  //with exception
			
			System.out.println("Remaining balance in account is: "+d2);
			
		} catch (InsufficientFundsException ie) {
			
			System.out.println(ie.getMessage());
			
		}
		
		System.out.println("Thanks for visiting");
        
	}

}
