package oOPSconcept;

public class ChildClass extends ParentClass{
	// creating object/instance of a class:
		// className refName = new className(); // new className() -> object of the class
	
	public void commonMethod() { // overrides oOPSconcept.GrandParentClass.commonMethod
		super.commonMethod();
		System.out.println("Common method from Child class");
	}

	public static void main(String[] args) {
		// Before inheritance
//		ParentClass pc = new ParentClass();
//		pc.printOut();
//		ParentClass.printOut("before inheritance");
		
		// After Inheritance
		ChildClass cc = new ChildClass();
//		cc.printOut();
//		ChildClass.printOut("after inheritance");
//		printOut("after inheritance again");
//		cc.grandParentMethod();
		
		// Polymorphism
//		ParentClass cc1 = new ChildClass(); // object of same class referring to super class
//		cc1.printOut();
//		cc1.grandParentMethod();
//		GrandParentClass cc2 = new ChildClass();
//		cc2.printOut(); // parent class method is not accessible
//		cc2.grandParentMethod();
		
		// Method overriding
		cc.commonMethod();
//		cc1.commonMethod();
//		cc2.commonMethod();

	}

}
