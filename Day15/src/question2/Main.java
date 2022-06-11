package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Your Joining Date in dd/MM/yyyy Pattern");
		String jd = scan.next();
		
		try {
		
		EmployeeBonus eb = new EmployeeBonus();
		double bonus = eb.bonus(jd);
		if(bonus != 0.0) {
			System.out.println("Bonus Amount = "+bonus);
		}
		
	}catch(InvalidAgeException iae) {
		System.out.println(iae.getMessage());
	}
		
		System.out.println("***Have a Wonderful Day***");
	}

}
