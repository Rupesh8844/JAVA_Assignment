package practice;

class Main {
public static void main(String[] args) {
	
// create an array bracket way
int[] marks = {40, 40, 55, 25, 55};
	
//	create an array new operater
//	int[] marks = new int[5];
//	marks[0]=40;
//	marks[1]=40;
//	marks[2]=55;
//	marks[3]=25;
//	marks[4]=55;
// access each array elements
//System.out.println("Accessing Elements of Array:");
//System.out.println("First Element: " + marks[0]);
//System.out.println("Second Element: " + marks[1]);
//System.out.println("Third Element: " + marks[2]);
//System.out.println("Fourth Element: " + marks[3]);
//System.out.println("Fifth Element: " + marks[4]);


//loop through the array
//using for loop
System.out.println("Using for Loop:");
for(int i=0;i<marks.length;i++) {
	System.out.println(marks[i]);
}
  } 

}
