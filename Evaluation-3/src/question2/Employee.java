package question2;

public abstract class Employee {
 int employeeId;
 String employeeName;
 double salary;
public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}
 
public Employee() {
	
}

abstract void calculateSalary();
 

public static void getAObj(Employee ans) {
	ans = new Employee(salary);
}





}