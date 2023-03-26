package javaBasics;

public class DataTypes {
	// Types: 1. Primitive Data types 		2. Reference/Object(Class) data types
	
		// Primitive Data Types: predefined data types | no class to refer to
			// numerical values:
			// 1.byte: small whole number 
			// 2.short: bigger than byte, whole number 
			// 3.int: integer, bigger than short, whole number 
			// 4.long: biggest whole number, "L" or "l"
			// 5.float: small decimal values, "f" 
			// 6.double: big decimal values, "d"
			
			// Non-numerical values:
			// 7. boolean: true or false
			// 8. char: character, single alphabet or numerical values -> '1' or 'A' or 'a'
			
		// Reference/Object(Class) data types: -> have class to refer to
			// String: any values (alphabetic, numerical or special characters or combination or space), "123values@(^*@^    "
			
			
		// creating data/Creating variables: 1. DataTypes 2. ReferenceName 3. Value

	public static void main(String[] args) {
		// 1.byte
		byte byteData = 20; // data
		System.out.println(byteData);
		// 2.short:
		short shortData = 200;
		System.out.println(shortData);
		// 3.int:
		int integerData; // variable without value assigned/un-initialized variable
		integerData = 1000; // assigned value
		System.out.println(integerData);
		
//		int integerData = 10; // duplicate variable
		
		// 4.long:
		long longData = 1000000l;
		System.out.println(longData);
		longData = 20000L; // re-assigning value
		System.out.println(longData);
		
//		int a = 10.5; // mis-match between data and dataType
		
		// 5.float:
		float floatData = 10.11f;
		System.out.println(floatData);
		floatData = 10.1111111111111f;
		System.out.println(floatData);
		
		// 6.double:
		double doubleData = 15.3333d;
		System.out.println(doubleData);
		
		// 7. boolean:
		boolean booleanData = true;
		booleanData = false;
		System.out.println(booleanData);
		
		// 8. char:
		char characterData = '1';
		characterData = 'b';
		characterData = 'X';
		System.out.println(characterData);
		
		// String:
		String stringData = "sdjfhdjfh4893164983217*&%T^&%^&%^    jhefjehwf"; // #1 way of creating String dataType
		System.out.println(stringData);
		
		// #2 way of creating String dataType -> Object creation way
		String stringData2 = new String("Hello Java!!");
		System.out.println(stringData2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
