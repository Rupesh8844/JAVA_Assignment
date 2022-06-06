package question4;

public class Customer {

	String username;
	String password;
	String mobileNumber;
	String email;
	public Customer(String username, String password, String mobileNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	public Customer(){
		
	}

	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
