package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
	// ArrayList - data table, 1 column -> ArrayList class -> create object of the class

	public static void main(String[] args) {
		// object creation
//		ArrayList al1 = new ArrayList(); // non-parameterized arrayList -> dataType not defined
		// add() -> inserting data
//		al1.add("David");
//		al1.add(10);	
//		al1.add(false);
		
		ArrayList<String> al2 = new ArrayList<String>(); // parameterized arrayList
		al2.add("David");
		al2.add("Mary");
		al2.add("Jack");
		al2.add("Dennis");

		System.out.println(al2); // peek inside arraylist
		
		// to extract value
		System.out.println(al2.get(4));
		
		System.out.println("Number of rows: "+al2.size());
		al2.add("Micheal");
		System.out.println("Number of rows: "+al2.size());
		
		System.out.println(al2);
		al2.add(1, "Johnny"); // adding value in a specific row, rest of the row will be pushed down
		System.out.println(al2);
		
		System.out.println(al2.size());
		al2.remove(3); // to remove value from a row, rest will be shifting left
		System.out.println(al2);
		System.out.println(al2.size());
		
		// contains() -> checking data in the arrayList
		System.out.println(al2.contains("Jack"));
		System.out.println(al2.contains("Dennis"));
		
//		System.out.println("Before clearing array: "+al2.isEmpty());
//		al2.clear(); // removing all data
//		System.out.println(al2);
//		System.out.println("After clearing array: "+al2.isEmpty());
		
		// equals() -> comparing arrayLists
		Object al3 = al2.clone();
		System.out.println(al2.equals(al3));
		al2.add("Jack");
		System.out.println(al2.equals(al3));
		
		System.out.println(al2.indexOf("Jack")); // index of a row
		System.out.println(al2.indexOf("Danny")); // negative output represent, data not present in arrayList
	}
	
	// Assignment_7: Customer|Library|Employee|Login functionality -> 1. 1-D array/2-D array | 2. ArrayList -> implement to the logic

}
