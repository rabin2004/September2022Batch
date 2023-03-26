package oOPSconcept;

public abstract class AbstractClassMethodImplementation extends AbstractionConcept { 
	// extending to abstract class -> 1. implement abstract methods or 2. change this class to abstract as well

	public static void main(String[] args) {
//		AbstractClassMethodImplementation acm = new AbstractClassMethodImplementation();
//		acm.abstractMethod1();
//		acm.abstractMethod2();
	}

	@Override
	void abstractMethod1() { // implemented abstract method will override abstract method
		System.out.println("Abstract method now implemented");	
	}
	
//	@Override
//	void abstractMethod2() { // implemented abstract method will override abstract method
//		System.out.println("Abstract method now implemented");	
//	}

}
