package javaBasics;

public class PrintingConcept {
	// shortcut for System.out.println() -> sysout press ctrl+spaceBar

	public static void main(String[] args) { 
		// println() -> print in a line
		System.out.println("First java class First java class First java class First java class First java class First java class");
		System.out.println(); // empty
		System.out.println("Second line");
		
		// print() -> print statement
		System.out.print("Hello");
		System.out.print("Java");
//		System.out.print(); // can't be empty
		
		System.out.println("Third line");
		System.out.print("Hello");
		System.out.print("Java");
		
		
		System.out.println("First java class First java class First java class First java class "
				+ "First java class First java class First java class First java class First java "
				+ "class First java class First java class First java class First java class First "
				+ "java class First java class First java class First java class First java class "
				+ "First java class First java class First java class First java class");
		
		// printing statement in different lines
		System.out.println("First java class"+"\n"+"First java class"+"\n"+"First java class"+"\n"+"First"
				+ " java class"+"\n"+"First java class"+"\n"+"First java class");
		
		System.out.println("Name"+"    "+"Phone"+"        "+"Email");
		System.out.println("David"+"   "+"123456789"+"   "+"david@gamil.com");
		
		// using \t -> tab space
		System.out.println("Name"+"\t"+"Phone"+"\t\t\t"+"Email");
		System.out.println("David"+"\t"+"123456789"+"\t\t"+"david@gamil.com");
		
		// printing error
		System.err.println("Something went wrong");
	}

}
