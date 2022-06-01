package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter Mobile model name");
			String name = scan.next();
			
			Mobile mob = new Mobile();
			
			
			mob.searchOutdatedModel(name);
		}

	}

}
