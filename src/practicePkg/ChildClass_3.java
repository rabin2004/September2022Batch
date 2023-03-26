package practicePkg;

import oOPSconcept.ParentClass;

public class ChildClass_3 extends ParentClass{

	public static void main(String[] args) {
		ChildClass_3 cc = new ChildClass_3();
		cc.printOut();
		cc.grandParentMethod();
		
		// different package
//		cc.a = "default property"; // ParentClass.a is not visible
		cc.b = "protected property";
//		cc.defaultMethod(); // defaultMethod() from the type ParentClass is not visible
		cc.protectedMethod();

	}

}
