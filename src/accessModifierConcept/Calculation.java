package accessModifierConcept;

final class Calculation {
	public int a,b;
	private String msg = "Calculation";
	String operation;
	protected String d;
	
	public int add() {
		System.out.println(msg);
		return a+b;
	}
	
	public int substract() {
		System.out.println(msg);
		return a-b;
	}
	
	public int multiply() {
		System.out.println(msg);
		return a*b;
	}
	
	public int divide() {
		System.out.println(msg);
		return a/b;
	}
	
	void printOp() {
		System.out.println(operation);
	}
	
	protected void printOp1() {
		System.out.println(d);
	}

}
