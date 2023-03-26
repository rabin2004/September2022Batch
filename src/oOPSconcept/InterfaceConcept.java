package oOPSconcept;

public interface InterfaceConcept {
	
	// Class Vs abstract Class
	// Class VS Interface
	// Interface Vs abstract Class
	
	// Interface: -> different java file other than class 
		// -> all methods defined will be default abstract
		// -> no instance/object can be created as it is interface
		// -> use inheritance concept to implement method in a class -> "implements" keyword
		// Multiple Inheritance -> parent_2 -> child <- parent_1 | in case of classes, is not allowed | in case of interface, it is allowed between interface & class
	
	int add(int a, int b);
	int substract(int a, int b);
	abstract int multiply(int a, int b); // can be used abstract but not necessary
	int division(int a, int b);
	

}
