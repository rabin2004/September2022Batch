package oOPSconcept;

public class ChildClass_2 extends ParentClass{

	public static void main(String[] args) {
		ChildClass_2 cc = new ChildClass_2();
		cc.printOut();
		cc.grandParentMethod();
		// same package
		cc.a = "default property";
		cc.b = "protected property";
		cc.defaultMethod();
		cc.protectedMethod();

	}

}
