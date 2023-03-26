package javaBasics;

public class DataOperation {

	public static void main(String[] args) {
		String firstName, lastName, address, emailAddress; // Creating variable
		int age, salary;
		
		firstName = "Mark";
		lastName = "K";
		address = "NYC";
		emailAddress = "mark_k@gmail.com";
		age = 30;
		salary = 120000;

		System.out.println("Employee Detail:");
		System.out.println();
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Address: "+address);
		System.out.println("Email address: "+emailAddress);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}

}
