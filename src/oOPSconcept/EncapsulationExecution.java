package oOPSconcept;

import java.util.Scanner;

public class EncapsulationExecution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Name:");
		
		EncapsulationConcept ec = new EncapsulationConcept();
		String customerName = ec.printName(scan.nextLine());
		
		System.out.print("SSN:");
		ec.setSSN(scan.nextLine());
		String cusSSN = ec.getSSN();
		
		System.out.print("DOB:");
		ec.setDob(scan.nextLine());
		String cusYOB = ec.getDob();
		
		System.out.println("Please validate following information provided and click confirm button: ");
		System.out.println("Name: "+customerName);
		System.out.println("SSN: "+cusSSN);
		System.out.println("Birth Year: "+cusYOB);
		System.out.println("Enter confirm/deny: ");
		String cusInput = scan.nextLine();
		scan.close();
		if(cusInput.equalsIgnoreCase("confirm")) {
			System.out.println("Form submission completed!");
		}else {
			System.err.println("Form submission cancelled!");
		}

	}

}
