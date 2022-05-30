package question4;

public class Instructor extends Person {
int instructorId=456;
int salary = 45612;
String address = "[city=Chennai,state=TN, pinCode=60001]]";
public int getInstructorId() {
	return instructorId;
}
public void setInstructorId(int instructorId) {
	this.instructorId = instructorId;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", address=" + address + "]";
}

}
