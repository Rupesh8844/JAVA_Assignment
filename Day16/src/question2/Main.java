package question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Employee> ts = new TreeSet<>();

		try {
			for(int i=1;i<=4;i++) {
				System.out.println("Enter the Details of Employee "+i);
				
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
				
				System.out.println("Enter the Employee Name");
				String name = sc.next();
				
				System.out.println("Enter the Employee Salary");
				double salary = sc.nextDouble();
				
				
				ts.add(new Employee(id,name,salary));
				System.out.println("==========================");
			}
//			ts.add(new Employee(01,"Ram",5000.0));
//			ts.add(new Employee(02,"Raja",60000.0));
//			ts.add(new Employee(03,"Rahul",15000.0));
//			ts.add(new Employee(04,"Rupesh",2000.0));
//			System.out.println(ts);
			
			
			for(Employee t:ts) {
				System.out.println();
				System.out.println("Employee ID : "+t.getEmpId());
				System.out.println("Employee Name : "+ t.getEmpName());
				System.out.println("Employee Salary : "+ t.getSalary());
				System.out.println("****************************");
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Please Enter the data in correct order");
		}
		
		}

}
