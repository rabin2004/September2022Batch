package oOPSconcept;

public class ParentClass extends GrandParentClass{
	
	private String className = "Parent class";
	String a;
	protected String b;
	
	public void printOut() {
		System.out.println(className);
	}
	
	public static void printOut(String a) {
		System.out.println(a);
	}
	
	void defaultMethod() {
		System.out.println(a);
	}
	
	protected void protectedMethod() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.grandParentMethod();
		
		pc.commonMethod();

	}
	
	public void commonMethod() { // overrides oOPSconcept.GrandParentClass.commonMethod
		super.commonMethod();
		System.out.println("Common method from Parent class");
	}

}
