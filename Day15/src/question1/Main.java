package question1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public int exactAge(String dob) throws InvalidDateFormat {
		
		int age = -1;
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(dob,dtf);
			LocalDate curr= LocalDate.now();
			
			if(date.isBefore(curr)) {
				age = (int) ChronoUnit.YEARS.between(date,curr);
				
			}
			else if(date.isAfter(curr)) {
				age = -1;
			}
		}
		catch(Exception e) {
			InvalidDateFormat idf = new InvalidDateFormat("Please Enter the date in correct pattern");
			throw idf;
			
		}
		return age;
		
	}
	
	
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter Your Date Of Bith in dd/MM/yyyy Pattern");
	String dob = scan.next();
	
	try {
		
	Main m = new Main();

	  int age = m.exactAge(dob);
	  
	  if(age != -1) {
		  System.out.println("Your current age : "+age);
	  }
	  else {
		  System.out.println("Date should not be in Future");
	  }
	}
	
	catch(InvalidDateFormat idf) {
		System.out.println(idf.getMessage());
	}
	
	
	
	System.out.println("***Thanks for filling it***");
  }

}
