package question2;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if(userCountry.equals("INDIA")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ie = new InvalidCountryException("User Outside India cannot be registered");
			throw ie;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String username = scan.next();
		
		System.out.println("Enter Your Country:");
		String userCountry = scan.next();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			
			ur.registerUser(username, userCountry.toUpperCase());
			
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("***Thanks For Filling Form***");
	}
}
