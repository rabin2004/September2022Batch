package javaBasics;

public class SwitchConcept {
	// Switch Concept: 1. input 2. defined options as case 3. Action/s 4. Every action will need break 4. default code section

	public static void main(String[] args) {
		// Customer -> open account (Debit/Credit/Saving/Mortgage Account)
		
		String accountType = "credit";
		System.out.println("Customer selected "+accountType);
		
		switch(accountType) {
		case "debit":
			System.out.println("Please fill up debit account form.");
			break;
		case "credit":
			System.out.println("Please fill up credit account form.");
			break;
		case "saving":
			System.out.println("Please fill up saving account form.");
			break;
		case "mortgage":
			System.out.println("Please fill up mortgage account form.");
			break;
		default:
			System.err.println("Product not available.");
			break;
		}


	}

}
