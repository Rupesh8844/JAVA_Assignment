package question2;


@SuppressWarnings("serial")  // we will read about this in serialization topic
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException() {
		
	}
}
