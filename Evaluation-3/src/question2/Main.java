package question2;

public class Main {

	public static void main(String[] args) {
		PermanentEmployee pe = new PermanentEmployee(01, "Ram", 15.0);
		TemporaryEmployee te = new TemporaryEmployee();
		
		
		Loan.getAobj(pe);
		Loan.getAobj(te);
		Loan.getAobj(null);
		
	}
}
