package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		String[] customer1 = {"David","K","davidk@gmail.com"};
		String[] customer2 = {"Dave","T","davet@gmail.com"};
		String[] customer3 = {"Micheal","C","michealC@gmail.com"};

		ArrayList<String[]> customerProfile = new ArrayList<String[]>();
		customerProfile.add(customer1);
		customerProfile.add(customer2);
		customerProfile.add(customer3);
		
//		System.out.println(customerProfile);
		Scanner scan = new Scanner(System.in);
		System.out.println("To search for a customer, Enter first name: ");
		String customerSearch = scan.nextLine();
		scan.close();
		
		for(String[] customer: customerProfile) {
			for(int i=0; i<customer.length; i++) {
				if(customer[i].equalsIgnoreCase(customerSearch)) {
					System.out.println("Customer found: "+customer[i]);
					break;
				}else {
					System.err.println("Customer not found!!");
				}
			}
		}
	}

}
