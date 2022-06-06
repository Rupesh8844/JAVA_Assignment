package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public  boolean validation(String username,String password,String mobile,String email) {
		boolean name =  Pattern.matches("[a-zA-z]{3,8}",username);
		
		boolean pass = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		
		boolean mob = Pattern.matches("[6789]{1}[0-9]{9}", mobile);
		
		boolean mail = Pattern.matches("[a-zA-z]{3,8}",email);
		
		System.out.println("name=="+name);
		System.out.println("pass=="+pass);
		System.out.println("mob=="+mob);
		System.out.println("mail=="+mail);
		if(name && pass && mob && mail) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username = scan.next();
		
		System.out.println("Enter Password");
		String password = scan.next();
		
		System.out.println("Enter Mobile Number");
		String mobile = scan.next();
		
		System.out.println("Enter Email");
		String email = scan.next();
		
		Demo d = new Demo();
		
		boolean b=  d.validation(username, password, mobile, email);
		
		if(b) {
			Customer c = new Customer(username, password, mobile, email);
			
			System.out.println("Username: "+ c.getUsername());
			System.out.println("Password: "+ c.getPassword());
			System.out.println("Mobile Number: "+ c.getMobileNumber());
			System.out.println("E-mail: "+ c.getEmail());
		}
		else {
			System.out.println("Please Enter crediantial Correctly");
		}
		
		
	}

}
