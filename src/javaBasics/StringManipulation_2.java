package javaBasics;

public class StringManipulation_2 {

	public static void main(String[] args) {
		String firstName, lastName;
		firstName = "MiCheal";
		lastName = "Johns";

		// converting to uppercase or lowercase
		String firstName_uppercased = firstName.toUpperCase();
		System.out.println("Welcome back "+firstName_uppercased+"!");
		String firstName_lowercased = firstName.toLowerCase();
		System.out.println("Welcome back "+firstName_lowercased+"!");
		
		// contains -> if char/char sequence is present or not | boolean
		String errorMsg = "Incorrect username or password. Please try again!";
		System.out.println(errorMsg.contains("username"));
		String exepctedErrorMsg = "Incorrect username or password. Please try again.";
		System.out.println(errorMsg.contains(exepctedErrorMsg));
		System.out.println(errorMsg.contains("a"));
		
		// length() -> length of String
		System.out.println("Length of error message: "+errorMsg.length());
		
		// index/position of a character -> index: first index is zero | position: starts from 1 => (index=position-1 | position=index+1)
		System.out.println("First occurrence of a: "+errorMsg.indexOf('a')); // first occurrence of a character
		System.out.println(errorMsg.indexOf("or")+1); // Position of "or"
		
		System.out.println(errorMsg.lastIndexOf("a")); // last occurrence of a char/String
		System.out.println(errorMsg.lastIndexOf("or"));
		
		// to capture multiple occurrence
		System.out.println("Second occurrence: "+errorMsg.indexOf("or", 4)); // second occurrence
		System.out.println("Second occurrence: "+errorMsg.indexOf("or", errorMsg.indexOf("or")+1)); // second occurrence
		System.out.println("Third occurrence: "+errorMsg.indexOf("or", errorMsg.indexOf("or", 
				errorMsg.indexOf("or")+1)+1));
		
		// character at a certain position
		System.out.println("Charater at 5th index or 6th position: "+errorMsg.charAt(5));
		
		// subString() -> breaking string and capturing a piece of String
		String name = firstName.toLowerCase()+" "+lastName.toLowerCase();
		System.out.println(name);
		lastName = name.substring(8);
		System.out.println(lastName);
		System.out.println(errorMsg.substring(32));
		
		System.out.println(errorMsg.substring(10,30)); // mid section of a string
		
		// Welcome customer by customer Initial
		String customerIntial = firstName.substring(0,1)+lastName.substring(0,1).toUpperCase();
		System.out.println("Welcome "+customerIntial+" back!");
		
		// validation
		String a = "   ";
		String b = "David";
		String c = "";
		
		System.out.println(a.isEmpty());
		System.out.println(a.length());
		System.out.println(c.isEmpty());
		System.out.println(c.length());
		
		System.out.println(a.isBlank());
		System.out.println(c.isBlank());
		
		System.out.println("Welcome "+a);
		System.out.println("Welcome "+b);
		System.out.println("Welcome "+c);
		
		// replace()
		String updateErrorMsg = errorMsg.replace("username", "Username");
		updateErrorMsg = updateErrorMsg.replace("password", "Password");
		updateErrorMsg = updateErrorMsg.replace("!", "");
		
		System.out.println(updateErrorMsg);
		
		// trim()
		name = "    David     ";
		name = name.trim();
		System.out.println("Welcome "+name+" back!!");
		
		// concat() -> concatenation/binding strings
//		customerIntial = firstName.substring(0,1)+lastName.substring(0,1).toUpperCase();
		customerIntial = firstName.substring(0,1).concat(lastName.substring(0,1).toUpperCase());
		System.out.println("Welcome "+customerIntial+" back!");
		
		// split() -> break String down ....??
		
		
		//Assignment-4: Customer database|Library|Employee|Tax calculation|Salary on hand
		
	}

}
