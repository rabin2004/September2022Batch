package javaAdvance;

import java.util.Scanner;

public class ReturnTypeConcept {
	static String customerInput;
	
	static String customerName() {
		String[] customers = {"David K","Micheal T","Mary K"};
		String a = "";
		for(int i=0; i<customers.length; i++) {
			if(customers[i].equals(customerInput)) {
				a = customers[i];
			}
		}
		return a;
	}
	
	static void returnCustomerInitial() {
		if(customerName().isBlank() || customerName().isEmpty()) {
			System.err.println("You will need to register first.");
		}else if(!customerName().isBlank() && !customerName().isEmpty()) {
			String[] initial = customerName().split(" ");
			String returnInitial = initial[0].substring(0,1).concat(initial[1].substring(0,1));
			System.out.println("Welcome back "+returnInitial);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		customerInput = scan.nextLine();
		scan.close();
		returnCustomerInitial();
	}
	
	//Assignment-10: Customer database|Library|Employee|Tax calculation|Salary on hand|calculator -> variables/method/static Vs non-static/constructor/method or constructor overloading/return type

}
