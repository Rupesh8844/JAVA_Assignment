package question1;
import java.util.Scanner;
public class Main {

	public static String reversString(String input){
		//write the logic
		
	  	char[] arr  =  input.toCharArray();
		StringBuilder stringBuilder = new StringBuilder("");
		
	  	for(int i=input.length()-1; i>=0; i--) {
	  		stringBuilder.append(arr[i]);
	  	}
		
		
		char[] bagString =  stringBuilder.toString();
		return bagString;
	
		}
		public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String to reverse");
			String orignalString = sc.next();
			String result =Main.reversString(orignalString);
			System.out.println("Original String is :"+ orignalString);
			System.out.println("Reversed String is :"+ result);
		}
		}
	
}
