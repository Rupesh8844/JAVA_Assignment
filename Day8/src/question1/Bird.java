package question1;

public class Bird {

	public void fly(){
		System.out. println("Bird is flying");
		}
}



/*
Q1)Create an class Bird, with method :
Public void fly(){
System.out. println(�Bird is flying�)
}
Create another class called Parrot as a child class of the above Bird class and
override the fly method with the following implementation:
System.out.println("I am Flying");
Inside this parrot class define another implemented method as follows:
public void sing(){
System.out.println("I am Singing");
}
Create a Main class with the main method as follows:
public class Main{
public static void main(String[] args){
Bird b1 = new Parrot();
//with this b1 reference call the fly method of
Parrot
//and after downcasting this b1 reference to the
Parrot class object, call the sing method also
}
}

*/