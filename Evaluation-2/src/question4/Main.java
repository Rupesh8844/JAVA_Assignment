package question4;

//import java.util.Scanner;

public class Main {

	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			  Student student = new Student();
				 student.name = "Harshit";
				 student.studentId=1;
				 student.courseFee=300000;
				 student.gender="Male";
				 student.coursrEnrolled="BackendDevloper";
				 student.address.city="Basti";
				 student.address.pincode="234324";
				 student.address.state="UttarPradesh";
				return student;
		}
		else {
			Instructor instructor= new Instructor();
//			 instructor.name="Ratan Sir";
			instructor.instructorId=456;
			 instructor.salary=100000;
			 instructor.gender="Male";
			 instructor.address.city="Delhi";
			 instructor.address.pincode="43242";
			 instructor.address.state="Delhi";
      return instructor;
		}
		
	}
  public static void main(String[] args) {
	

	 Person newStudent = generatePerson(new Student());
	 Person newTeacher = generatePerson(new Instructor());
	 
	 System.out.println(newStudent);
	 
	 System.out.println("                        ");
	 System.out.println(newTeacher);
	 
     }
	
}
