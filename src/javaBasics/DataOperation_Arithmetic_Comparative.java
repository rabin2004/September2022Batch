package javaBasics;

public class DataOperation_Arithmetic_Comparative {
	
	// Operation: 1. Arithmetic		2. Comparative
		// Arithmetic: -> +, -, *, /
		// Comparative: -> comparison -> boolean output (true or false)
			// Comparative operators: -> for numerical values
			// 1. equals to -> "==" -> 2==2 -> true
			// 2. not equal to -> "!=" -> 2!=2 -> false
			// 3. more than -> ">"  -> 3>2 -> true
			// 4. less than -> "<"  -> 3<2 -> false
			// 5. more than or equal to -> ">=" -> 3>=2 -> true
			// 6. less than or equal to -> "<=" -> 3<=2 -> false

	public static void main(String[] args) {
		int a, b;
		
		a = 150;
		b = 200;
		
		System.out.println(a+b); // 350
		System.out.println(a*b); // 30000
		System.out.println(a-b); // -50
		System.out.println(a/b); // 0 -> if 1.6 => show 1
		
		double x,y;
		x = a;
		y = b;
		
		System.out.println(x+y); // 350
		System.out.println(x*y); // 30000
		System.out.println(x-y); // -50
		System.out.println(x/y); // 0.75
		
		x = 150;
		y = 200;
		System.out.println(x+y); // 350
		System.out.println(x*y); // 30000
		System.out.println(x-y); // -50
		System.out.println(x/y); // 0.75

		// Temperature conversion from C to F
		double c,f; 
		c = 5;
		
		f = c*9/5+32;
//		System.out.println(f); //50
//		System.out.println("Temperature in F: "+(c*9/5+32)); // first + => place | 2nd + => addition
		
//		c = f-32*5/9;
//		System.out.println(c); // 33
//		
//		c = (f-32)*5/9;
//		System.out.println(c); // 10
		
		double actual_F = f;
		double expected_F = 45;
		
		System.out.println("Test case pass: "+(actual_F==expected_F));
		System.out.println("Test case fail: "+(actual_F!=expected_F));
		
		// Positive scenario & Negative scenario
		
		System.out.println("Test case pass: "+(actual_F>expected_F));
		System.out.println("Test case fail: "+(actual_F<expected_F));
		System.out.println("Test case pass: "+(actual_F>=expected_F));
		System.out.println("Test case fail: "+(actual_F<=expected_F));
		
		String customerInDataBase = "Kelly";
//		String customerEnteringBuilding = "Kelly";
		String customerEnteringBuilding = new String("Kelly");
		
		System.out.println("Access Granted: "+
		(customerEnteringBuilding==customerInDataBase));
		System.out.println("Deny Access: "+
				(customerEnteringBuilding!=customerInDataBase));
	}

}
