package question4;

public class Student extends Person{

	int studentId;
	String coursrEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", coursrEnrolled=" + coursrEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + ",]";
	}

	
	
}
