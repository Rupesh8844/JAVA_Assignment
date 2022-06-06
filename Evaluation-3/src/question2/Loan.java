package question2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		double loan;
		
		if(employeeObj instanceof PermanentEmployee) {
			 loan = (15/100) * employeeObj.salary;
			
		}
		else {
			loan = (10/100) * employeeObj.salary;
			
		}
		return loan;
	}
	
	private  Loan() {
		
	}

	public static void getAobj(Employee employeeObj) {
		Loan l = new Loan();
		double ans = l.calculateLoanAmount(employeeObj);
		System.out.println("Result="+ans);
	}
}
