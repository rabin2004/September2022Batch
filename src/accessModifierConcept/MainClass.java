package accessModifierConcept;

import practicePkg.TempConversion;

public class MainClass {
	public String a;
	private String b;
	String c;
	protected String d;
	
	final String e = "final variable"; // can't be  uninitialized/blank
	
	public void printStatement() {
		System.out.println(a);
	}
	
	private void printStatement2() {
		System.out.println(b);
	}
	
	void printStatement3() {
		System.out.println(c);
	}
	
	protected void printStatement4() {
		System.out.println(d);
	}

	public static void main(String[] args) {
		// public properties:
		 // same class
		MainClass mc = new MainClass();
		mc.a = "public properties";
		mc.printStatement();
		 // class of same pkg
		Calculation c = new Calculation();
		c.a = 500;
		c.b = 100;
		System.out.println("Addition: "+c.add());
		System.out.println("Multiplication: "+c.multiply());
		System.out.println("Substraction: "+c.substract());
		System.out.println("Division: "+c.divide());
		 // class of diff pkg
		TempConversion tc = new TempConversion(); // if from different pkg - pkgName.className needs to be imported
		tc.tempC = 28;
		System.out.println("Converted temp in F: "+tc.convertToF());
		tc.tempF = 72;
		System.out.println("Converted temp in C: "+tc.convertToC());
		
		// private properties:
		mc.b = "private properties";
		mc.printStatement2();
			// private properties accessing from different class
//		c.msg; // Calculation.msg is not visible
//		tc.a; // Calculation.msg is not visible
		
		// default properties:
		mc.c = "default properies";
		mc.printStatement3();
			// same pkg
		c.operation = "math calculation";
		c.printOp();
			// diff pkg
//		tc.operation = "temp conversion"; // is not visible
//		tc.printOp(); // is not visible
		
		// protected properties:
		mc.d = "protected properties";
		mc.printStatement4();
			// same pkg
		c.d = "protected properties";
		c.printOp1();
			// different pkg
//		tc.d = "protected properties"; // is not visible
//		tc.printOp1(); // is not visible
		
		// final variable
		System.out.println(mc.e);
//		mc.e = "different value"; // The final field MainClass.e cannot be assigned
		
	}

}
