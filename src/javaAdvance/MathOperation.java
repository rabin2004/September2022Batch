package javaAdvance;

public class MathOperation {
	int a,b; // instance variable
	static int d,e; // class variable
	
	public void add() {
		System.out.println(a+b);
		System.out.println(d+e);
	}
	
	public void substract() {
		System.out.println(a-b);
		System.out.println(d-e);
	}
	
	public void division() {
		System.out.println(a/b);
		System.out.println(d/e);
	}
	
	public void multiply() {
		System.out.println(a*b);
		System.out.println(d*e);
	}

}
