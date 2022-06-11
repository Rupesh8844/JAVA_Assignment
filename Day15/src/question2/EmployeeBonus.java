package question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {

	public double bonus(String jd) throws InvalidAgeException {
		
		try {
			
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
		LocalDate date = LocalDate.parse(jd,dtf);
		LocalDate curr= LocalDate.now();
		
		
		
		
		
       if	(!date.isAfter(curr)) {
			
		    int age = (int) ChronoUnit.YEARS.between(date,curr);
		
				if(age<1) {
					return 5000.0;
				}
				else if(age>=1 && age<2) {
					return 8000.0;
				}
				else {
					return 10000.0;
				}
			
		}
       
       else {
//       if(date.isAfter(curr)) {
			InvalidAgeException iae = new InvalidAgeException("Age should not be in the future");
			throw iae;
		  }
		
	}catch(DateTimeParseException e) {
		InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
		throw iae;
		
//		direct process :-  throw new InvalidAgeException("Please pass the date in the correct format");  
		}
		

		
	}
	
}
