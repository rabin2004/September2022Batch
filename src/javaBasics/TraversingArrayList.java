package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingArrayList {

	public static void main(String[] args) {
		ArrayList<String> customerFirstName = new ArrayList<String>(); // parameterized arrayList
		customerFirstName.add("David");
		customerFirstName.add("Mary");
		customerFirstName.add("Jack");
		customerFirstName.add("Dennis");
		
		// Traversing through arrayList
		// 1. for
//		for(int i=0; i<customerFirstName.size(); i++) {
//			System.out.println(customerFirstName.get(i));
//		}
		
		// 2. while
//		int a=0;
//		while(a<customerFirstName.size()) {
//			System.out.println(customerFirstName.get(a));
//			a++;
//		}
		
		// 3. forEach loop
//		for(String x: customerFirstName) {
//			System.out.println(x);
//		}
		
		// 4. iterator
		Iterator<String> it = customerFirstName.iterator();
//		System.out.println(it.hasNext());
//		System.out.println("Customer in 1st row: "+it.next());
//		System.out.println(it.hasNext());
//		System.out.println("Customer in 2nd row: "+it.next());
//		System.out.println(it.hasNext());
//		System.out.println("Customer in 3rd row: "+it.next());
//		System.out.println(it.hasNext());
//		System.out.println("Customer in 4th row: "+it.next());
//		System.out.println(it.hasNext());
//		System.out.println("Customer in 5th row: "+it.next()); // no 5th row -> NoSuchElementException
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
