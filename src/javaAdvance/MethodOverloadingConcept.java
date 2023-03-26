package javaAdvance;

public class MethodOverloadingConcept {
	
	// Method Overloading: creating method with same name but different number/type of parameter
	
	void add() {
		int a,b;
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	// duplicate method not allowed -> same method signature
	void add(int a) {
		System.out.println(a+50);
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, String c) {
		System.out.println(c+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloadingConcept ml = new MethodOverloadingConcept();
		ml.add();
		ml.add(5);
		ml.add(10, 25);
		ml.add(30, 7, "Addition: ");
	}

}
