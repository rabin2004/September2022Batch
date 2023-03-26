package javaBasics;

public class ConditionsConcept {
	
	// Condition:
		// Switch -> employee entering building - swipe card
			// Condition/s -> Action_1 - allow entry into building
			// Condition/s -> Action_2 - deny entry
	
	// if(condition/s) {action-1} -> condition fulfilled execution action
	// else if(condition/s) {action-2} -> condition fulfilled execution action
	// else() {action-3} -> none of the condition fulfilled execution action
	
	// Use: if only | if & else | if, else if(multiple) & else | if & else if
	
	// to introduce more conditions -> 1. && - And operator -> condition_1 && condition_2  
									// 2. || - Or operator -> condition_1 || condition_2

	public static void main(String[] args) {
		String validEmployee = "David#123";
		String validEmployeePIN = "123";
		String employeeCardSwip = "David#321";
		String employeeEntryPIN = "123";
		
//		if(employeeCardSwip.equals(validEmployee)) {
//			System.out.println("Access granted!");
//		}else {
//			System.err.println("Access Denied!");
//		}
		
//		if(employeeCardSwip.equals(validEmployee)) {
//			System.out.println("Access granted!");
//		}else if(!employeeCardSwip.equals(validEmployee)) { // ! in condition -> will change the output
//			System.err.println("Something went wrong. Swip again!");
//		}
		
		if(employeeCardSwip.equals(validEmployee)) {
			if(employeeEntryPIN.equals(validEmployeePIN)) {
				System.out.println("Access granted!");
			}else {
				System.err.println("Wrong PIN. Try again!");
			}
		}else {
		System.err.println("Access Denied!");
		}
		
	}

}
