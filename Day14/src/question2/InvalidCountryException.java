package question2;

@SuppressWarnings("serial")  // we will read about this in serialization topic
public class InvalidCountryException extends Exception{

	public InvalidCountryException(String message) {
		super(message);
	}

	public InvalidCountryException() {
		
	}
}
