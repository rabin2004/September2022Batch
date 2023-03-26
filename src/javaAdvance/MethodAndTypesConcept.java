package javaAdvance;

public class MethodAndTypesConcept {
	// Object: something that has state & behavior (properties)
		// state -> variables
		// behavior -> methods
		
		// creating object/instance of a class:
			// className refName = new className();
	
	// Creating method: Basic requirements: 
		// 1. return type (at least void - if returning nothing)
		// 2. method signature -> methodName()
		// 3. method block/code block -> {code}
	
	void test() {
		// code block
	}
	
	// parameter: -> variable defined in method signature, value can't be assigned to this variable
	
	// Types of Method:
		// 1. Method without parameter: -> no parameter
	static void test1() {
		System.out.println("Method without parameter");
	}
		// 2. Method with single parameter: -> parameterized method
	static void test2(String a) {
		System.out.println(a);
	}
		// 3. Method with multiple(same/different) parameter: -> parameterized method
	static void test3(char a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		test1();
		test2("Method with single parameter");
		test2("calling method again");
		test3('+',10,20);
		
	}
	
	//Assignment-9: Customer database|Library|Employee|Tax calculation|Salary on hand |calculator -> variables/method/static Vs non-static
	
	
	
	
	
	
	
	
	
	
	
}
