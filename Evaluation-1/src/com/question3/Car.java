package com.question3;

public class Car {
/*
 * Question 3:

Make a Bean Class named Car that has-A Java Bean Engine class in it.

Class Car has following fields-
String model;
String companyName;
String Color;
Engine engine;

Class Engine has following fields-
Int rmp;

Int Power;
String manufacturer;
Boolean hasTurbo;
Inside this class make one method that can enable turbo in the engine.
(Initially make sure that engine does n’t have a turbo but you have to enable it from the method call.)

Make a main class and inside that make two Car objects one with no-Argument Constructor and other with the
Parameterised Constructor.

Print the details of each car object.
Sample OutPut:
Car Model : Harrier
Car companyName : Tata
Car color : black
Car RPM : 10000
Car power : 110
Car Engine Manufacture : tata
Car Has Turbo : true
 */
	
	String model;
	String companyName;
	String Color;
	String engine;
	
	void details() {
		System.out.println("Car Model : "+ model);
		System.out.println("Car companyName : "+ companyName);
		System.out.println("Car Color : "+ Color);
//		System.out.println("Car engine : "+ engine);
		
	}
	
	
}
