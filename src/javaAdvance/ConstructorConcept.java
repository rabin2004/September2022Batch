package javaAdvance;

import java.util.Scanner;

public class ConstructorConcept {
	
	// Constructor: 
			// 1. special method carry name of the class
			// 2. constructor don't need to be called directly
			// 3. constructor will be called every time object/instance of the class is created
			// 4. constructor creation is not mandatory
			// 5. if constructor isn't created, a default constructor will be assigned whenever object/instance created
			// 6. Constructor can be overloaded as well
			// 7. assigning value instance variables/some code that needs to be executed first
			// 8. no return type
	
	// creating object/instance of a class:
				// className refName = new className(); // className() -> constructor of a class
				// className refName = new constructorOfTheClass;
	
	// Creating method: Basic requirements: 
			// 1. return type (at least void - if returning nothing)
			// 2. method signature -> methodName()
			// 3. method block/code block -> {code}
	
	ConstructorConcept(){ // constructor without parameter
		System.out.println("I am inside constructor");
	}
	
	ConstructorConcept(String a){ // constructor with parameter
		System.out.println(a);
	}
	
	ConstructorConcept(int a, int b){ // parameterized constructor
		System.out.println(a+b);
	}
	
	int a,b,e;
	ConstructorConcept(int b, int c, int d){
		this.b = b;
		this.a = c;
		e = d;
	}
	
	void add() {
		System.out.println(a+b+e);
	}
	
	void substract() {
		System.out.println(a-b-e);
	}
	
	void test() {
		System.out.println("I am inside regular method");
	}
	
	
	// using return type
	static String returnCustomerInitial(String firstName, String lastName) {
		String cusInitial = firstName.substring(0,1).concat(lastName.substring(0,1)).toUpperCase();
//		System.out.println(cusInitial);
		return cusInitial;
	}

	public static void main(String[] args) {
//		System.out.println("I am inside main method");
//		ConstructorConcept cc = new ConstructorConcept();
//		cc.test();
		
//		ConstructorConcept cc1 = new ConstructorConcept("I am overloaded constructor");
//		ConstructorConcept cc2 = new ConstructorConcept(50,25);
//		cc2.test();
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 3 numerical values: ");
//		ConstructorConcept cc3 = new ConstructorConcept(scan.nextInt(), scan.nextInt(),scan.nextInt());
//		scan.close();
//		cc3.add();
//		cc3.substract();
		
		System.out.println("Enter firt and last name: ");
//		returnCustomerInitial(scan.next(), scan.next());
//		scan.close();
		
		System.out.println("Welcome back "+returnCustomerInitial(scan.next(), scan.next())+"!");
		System.out.println("Welcome back "+returnCustomerInitial(scan.next(), scan.next()).toLowerCase()+"!");
		scan.close();
		
		
		
		
		
		
		
		
	}
	

}
