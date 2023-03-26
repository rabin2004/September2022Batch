package javaAdvance;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	// creating object
//		Substraction sub = new Substraction();
//		sub.substract();
		
//		Addition ad = new Addition();
//		ad.add();
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first value: ");
//		int firstValue = scan.nextInt();
//		System.out.println("Enter second value: ");
//		int secondValue = scan.nextInt();
//		scan.close();
		
//		ad.add2(firstValue, secondValue);
//		sub.substract2(firstValue, secondValue);
		
		MathOperation mo = new MathOperation();
		System.out.println("Enter first value: ");
		mo.a = scan.nextInt();
		System.out.println("Enter second value: ");
		mo.b = scan.nextInt();
		MathOperation.d = mo.a;
		MathOperation.e = mo.b;
		scan.close();
	
		mo.add();
		mo.substract();
		mo.division();
		mo.multiply();

		
		
	}
	
	// Assignment: 1. Array & ArrayList | 2. ArrayList/Array & HashMap/Hashtable | 3. calculator application/banking application

}
