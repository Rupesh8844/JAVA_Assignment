package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int arrlen = scan.nextInt();
		
		int[] arr = new int[arrlen];
		
		for(int i= 0;i<arr.length;i++) {
			System.out.println("Enter the elements in the array");
			arr[i]=scan.nextInt();
		}
		
		try {
			System.out.println("Enter the index of the array element you want to access");
			int num = scan.nextInt();
			
			int res = arr[num];
			System.out.println("The array element at index "+num+" = "+res);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("You cannot access element out of index");
		}
		
		}
	
}
