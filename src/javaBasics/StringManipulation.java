package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
		String customerInDataBase = "Kelly";
		String customerEnteringBuilding = "Kelly";
		String customerRe_EnteringBuilding = new String("Kelly");
		
		// not to used for comparison
//		System.out.println("Access Granted: "+
//		(customerEnteringBuilding==customerInDataBase));
//		System.out.println("Access Granted: "+
//				(customerRe_EnteringBuilding==customerInDataBase));
		
		// equals() -> comparing 2 string, boolean output | case sensitive
		System.out.println("Access Granted: "
		+customerEnteringBuilding.equals(customerInDataBase));
		System.out.println("Access Granted: "
				+customerRe_EnteringBuilding.equals(customerInDataBase));
		customerRe_EnteringBuilding = "kelly";
		System.out.println("Access Granted: "
				+customerRe_EnteringBuilding.equals(customerInDataBase));
		
		// equalsIgnoreCase() -> comparing 2 string, boolean output | not case sensitive
		System.out.println("Access Granted: "
		+customerRe_EnteringBuilding.equalsIgnoreCase(customerInDataBase));
		
		// compareTo() -> comparing 2 string, case sensitive | integer/numerical output -> 0 comparison is correct, anything other than zero is incorrect
		System.out.println(customerEnteringBuilding.compareTo(customerInDataBase));
		System.out.println(customerRe_EnteringBuilding.compareTo(customerInDataBase));
		
		// compareToIgnoreCase() -> comparing 2 string, not case sensitive | integer/numerical output -> 0 comparison is correct, anything other than zero is incorrect
		System.out.println(customerEnteringBuilding.compareToIgnoreCase(customerInDataBase));
		System.out.println(customerRe_EnteringBuilding.compareToIgnoreCase(customerInDataBase));
	}
	
	//Assignment-3: Customer database|Library|Employee|Tax calculation|Salary on hand -> Data operations(arithmetic/comparative) | String manipulations

}
