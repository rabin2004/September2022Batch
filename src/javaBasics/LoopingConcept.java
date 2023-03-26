package javaBasics;

public class LoopingConcept {
	// Looping concept: repeat action based on condition
		// 3 requirements: 1. create counter variable(start point) | 2. condition(stop point) | 3. increment/decrement(pattern)
		// 1. for loop: for(1; 2; 3){action_1}
		// 2. while loop: 1; while(2){action_1; 3;}

	public static void main(String[] args) {
		// print 1 - 100
//		int a=1;
//		int b=2; // -----100
//		System.out.println(a);
//		System.out.println(b); // -----100

		// for loop
//		for(int i=1; i<=100; i=i+1) {
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i=i+1;
//		}
		
		// 99->0
//		for(int i=99; i>=0; i=i-1) {
//			System.out.println(i);
//		}
		
//		int i = 99;
//		while(i>=0) {
//			System.out.println(i);
//			i=i-1;
//		}
		
		// search 100 product
//		for(int i=1; i<=100; i++) { // i=i+1 => i++
//			System.out.println("Search product_"+i+": ");
//		}
		
//		int i = 100;
//		while(i>0) { // i>=1
//			System.out.println("Search product_"+i+": ");
//			i--; // i=i-1 => i--
//		}
		
		// print even numbers from 1-100
//		for(int i=2; i<=100; i=i+2) {
//			System.out.println(i);
//		}
		
		// print odd numbers from 100-1
//		int i = 99;
//		while(i>=1) {
//			System.out.println(i);
//			i=i-2;
//		}
		
		// Infinite loop
//		for(int i=1; i>=1 ; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10;) {
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//		}
		
		// reverse String -> apple -> elppa
		String a = "Apple is good for health.";
		int lastIndex = a.length()-1;
		for(int i=lastIndex; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	// Assignment_5: 
		// 1. 1-1000/1000`-1/Odd/even
		// 2. Student selecting majors(switch)->register for that major->Student needs receive confirmation->use reverse students initial & reversed year of birth to create studentID
		// 3. Use multiple conditions using &&/|| operator: Any one -> Customer database|Library|Employee|Tax calculation|Salary on hand

}
