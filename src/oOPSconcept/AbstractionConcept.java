package oOPSconcept;

public abstract class AbstractionConcept {
	// Abstraction: -> hiding functionalities and only showing that can be accessed/used
	
	// abstract method: -> different than regular method -> "abstract" keyword | no method implementation (method body is not present) | class needs to abstract as well
	
	// Creating Regular method: Basic requirements: 
			// 1. return type (at least void - if returning nothing)
			// 2. method signature -> methodName()
			// 3. method block/code block -> {code}
	
	// abstract class: can only handle abstract method as well regular method but don't need to have abstract method | instance/object of abstract class can't be created
	
	// non-abstract class (regular class): can't handle abstract method
	
	void test() {
		// code
		System.out.println("Regular method");
	}
	
	abstract void abstractMethod1(); // method without implementation
	abstract void abstractMethod2();

	public static void main(String[] args) {
//		AbstractionConcept ac = new AbstractionConcept(); // instance of abstract class can't be created

	}

}
