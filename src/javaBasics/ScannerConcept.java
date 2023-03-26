package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	// Scanner concept -> accept user input
		// Scanner class -> allow system to accept user input
			// what data type of input to accept

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter first name: ");
		
		// nextLine() & next() -> to accept String input
//		String firstName = scan.nextLine();
//		System.out.println("Please enter last name: ");
//		String lastName = scan.nextLine();
//		scan.close();
//		System.out.println("Welcome "+firstName.charAt(0)+lastName.charAt(0));
//		System.out.println("Welcome "+(firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase()));
		
		// login concept
//		String usernameDB, passwordDB;
//		usernameDB = "Mick123";
//		passwordDB = "m@123";
//		
//		System.out.println("Username: ");
//		String username = scan.next();
//		System.out.println("Password: ");
//		String password = scan.next();
//		
//		if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
//			System.out.println("Login successful.");
//			System.out.println("Welcome back "+username+"!");
//		}else {
//			System.err.println("Login failed. Either Username or password is wrong.");
//			System.out.println("Please try again!");
//			System.out.println("Username: ");
//			username = scan.next();
//			System.out.println("Password: ");
//			password = scan.next();
//			scan.close();
//			if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
//				System.out.println("Login successful.");
//				System.out.println("Welcome back "+username+"!");
//			}else {
//				System.err.println("Login failed. Either Username or password is wrong.");
//				System.err.println("Account blocked. Contact customer service.");
//			}
//		}
		
		// calculator
//		System.out.println("Enter a number: ");
//		int a = scan.nextInt();
//		scan.close();
//		
//		for(int i=0; i<=a; i++) {
//			System.out.println(i);
//		}
		
		// Account application
		System.out.println("Select account to apply (Debit,Credit,Saving or Mortage): ");
		String accountType = scan.next().toUpperCase();
		
		switch(accountType) {
		case "DEBIT":
			System.out.println("Debit account form.");
			System.out.println("Name: ");
			String name = scan.next();
			System.out.println("Address: ");
			String address = scan.next();
			System.out.println("Phone number: ");
			String phone = scan.next();
			System.out.println("Email address: ");
			String email = scan.next();
			if(!name.isBlank() && !address.isBlank() && !phone.isBlank() && !email.isBlank()) {
				System.out.println("Acccount created!");
				System.out.println("Email will be sent out for verification at "+email+"!");
			}else {
				System.out.println("Invalid information. Try again!");
			}
			break;
		case "CREDIT":
			System.out.println("Credit account form.");
			System.out.println("Name: ");
			String nameC = scan.next();
			System.out.println("Address: ");
			String addressC = scan.next();
			System.out.println("Phone number: ");
			String phoneC = scan.next();
			System.out.println("Email address: ");
			String emailC = scan.next();
			if(!nameC.isBlank() && !addressC.isBlank() && !phoneC.isBlank() && !emailC.isBlank()) {
				System.out.println("Acccount created!");
				System.out.println("Email will be sent out for verification at "+emailC+"!");
			}else {
				System.out.println("Invalid information. Try again!");
			}
			break;
		case "SAVING":
			System.out.println("Saving account form.");
			System.out.println("Name: ");
			String nameS = scan.next();
			System.out.println("Address: ");
			String addressS = scan.next();
			System.out.println("Phone number: ");
			String phoneS = scan.next();
			System.out.println("Email address: ");
			String emailS = scan.next();
			if(!nameS.isBlank() && !addressS.isBlank() && !phoneS.isBlank() && !emailS.isBlank()) {
				System.out.println("Acccount created!");
				System.out.println("Email will be sent out for verification at "+emailS+"!");
			}else {
				System.out.println("Invalid information. Try again!");
			}
			break;
		case "MORTGAGE":
			System.out.println("Mortgage account form.");
			System.out.println("Name: ");
			String nameM = scan.next();
			System.out.println("Address: ");
			String addressM = scan.next();
			System.out.println("Phone number: ");
			String phoneM = scan.next();
			System.out.println("Email address: ");
			String emailM = scan.next();
			if(!nameM.isBlank() && !addressM.isBlank() && !phoneM.isBlank() && !emailM.isBlank()) {
				System.out.println("Acccount created!");
				System.out.println("Email will be sent out for verification at "+emailM+"!");
			}else {
				System.out.println("Invalid information. Try again!");
			}
			break;
		default:
			System.err.println("Product not available.");
			break;
		}
		scan.close();
	}

}
