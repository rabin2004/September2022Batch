package javaAdvance;

public class VariableAndTypesConcept {
	// Object: something that has state & behavior (properties)
	// state -> variables
	// behavior -> methods
	
	// creating object/instance of a class:
		// className refName = new className();
	
	// Variables: represents state of a class/object of a class
	
	// Variables Types:
		// 1. Instance variable/Non-static variable: variable created/initialized inside the class but outside any method and non-static nature
		// 2. Class variable/static variable: variable created/initialized inside the class but outside any method, static in nature
		// 3. Local variable: variable is created inside the method | method will have life inside that method only

	int b = 20; // instance variable, value assigned
	int c; // instance variable, value unassigned
	static int d = 70; // class variable, value assigned
	static int e; // class variable, unassigned
	
	public static void test1() { // static method
		int a = 10; // local variable
		System.out.println(a);
		VariableAndTypesConcept vt = new VariableAndTypesConcept(); // locally created object
		System.out.println(vt.b);
//		System.out.println(b);
		vt.c = 50;
		System.out.println(a+vt.b+vt.c);
		// class/static variable calling
		System.out.println(d+e);
		System.out.println(VariableAndTypesConcept.d+VariableAndTypesConcept.e);
//		System.out.println(vt.d+vt.e); // The static field VariableAndTypesConcept.e should be accessed in a static way
	}
	
	// Static - Non-static mismatch
	
	public void test2() { // non-static method -> can directly access non-static properties
		c = 50;
		System.out.println(b+c);
		System.out.println(d+e);
	}
	
	public static void main(String[] args) {
		VariableAndTypesConcept vt = new VariableAndTypesConcept();
//		System.out.println(a); // local variable to method test(), can't be accessed
		// static method calling
		test1();
		VariableAndTypesConcept.test1();
//		vt.test1();
	
		// non static method calling
		vt.test2();
//		test2(); - non-static property can't be called directly
	}

}
