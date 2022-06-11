package question1;

@SuppressWarnings("serial")  //don't know this  but we will read in serialiation

//  creating user defined exception [ if we use(extends Exception) than it is {checked Exception}
//  else we use(extends RuntimeException) than it is {Unchecked Exception}


public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException() {
		
	}
	
}
