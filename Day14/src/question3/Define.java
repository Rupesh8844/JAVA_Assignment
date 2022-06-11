package question3;

/*
 The "finally" block is used to execute the necessary code of the program. It is
executed whether an exception is handled or not. irrespective of try and catch block.

   The final keyword is a non-access modifier used for classes and methods,
    which makes them non-changeable (impossible to inherit or override) or constant.
 */




//  Example inside this code 
public class Define {

	final static String a = "final keyword example"; //   final keyword example
	
	public static void main(String[] args) {
		System.out.println("Defination");

	         
			try {
				System.out.println("Code start....");
				System.out.println(a);
			System.out.println("Here Implement your code");
			
			
				
			} catch (Exception ie) {
				
				System.out.println("Code inside catch block.....");
				
			}finally {      //  finally block example
				System.out.println("Code inside finally block.....  and example of finally block");
			}
			
			System.out.println("Code is completed");
	        
		}

	}


