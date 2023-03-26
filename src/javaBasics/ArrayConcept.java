package javaBasics;

import java.util.Scanner;

public class ArrayConcept {
	// Array Concept = to create table
		// 1-Dimensional(1 column) | 2-Dimensional (multiple column)
	
	// Creating array: 1. dataType 2. reference name 3. defining size of array 4. inserting data

	public static void main(String[] args) {
		// 1-D array
		// #1 creating array
		int[] arrayA = new int[4]; // 4 -> number of rows
		// inserting data
		arrayA[0] = 10; // 1st row
		arrayA[1] = 20;
		arrayA[2] = 30;
		arrayA[3] = 40;
//		arrayA[4] = 50; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// extract data
		System.out.println("Data in 2nd row: "+arrayA[1]);
		System.out.println("Data in 4th row: "+arrayA[3]);
		
		String username[] = new String[7]; //String[] username or String username[] -> both acceptable
		username[0] = "KAl123";
		username[1] = "AK456";
		username[2] = "BM789";
		username[3] = "KAl123";
		username[4] = "AK456";
		username[5] = "BM789";
		username[6] = "BM789";
		System.out.println("Number of rows: "+username.length);
		System.out.println("Index of last row: "+(username.length-1));
		// traversing 1-D array
//		for(int i=0; i<=username.length-1;i++ ) { // go upto last index or stay less than length of array
//			System.out.println(username[i]);
//		}
		
//		for(int i=0; i<username.length; i++) {
//			System.out.println(username[i]);
//		}
		
		int lastIndex = username.length-1; 
		while(lastIndex>=0) {
			System.out.println(username[lastIndex]);
			lastIndex--;
		}
		
		// #2 creating array
		String password[] = {"a123","b123","c123","d123","e123","f123"};
		System.out.println("Data on last row: "+password[password.length-1]);
		System.out.println("Number of rows: "+password.length);
		
		// Customer profile
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide following details:");
		System.out.println("Name: ");
		String name = scan.next();
		System.out.println("Address: ");
		String address = scan.next();
		System.out.println("Phone number: ");
		String phone = scan.next();
		System.out.println("Email address: ");
		String email = scan.next();
		scan.close();
		String[] customerProfile1 = {name, address, phone, email};
		System.out.println("Please check details provided are correct:");
		for(int i=0; i<customerProfile1.length; i++) {
			System.out.println(customerProfile1[i]);
		}

	}
	
	//Assignment-6: Query application for Customer|Library|Employee|Try to incorporate 1-D array

}
