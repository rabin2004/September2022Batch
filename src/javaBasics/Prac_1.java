package javaBasics;

public class Prac_1 {

	public static void main(String[] args) {
		// Appointment scheduling in Bank
		
		String name, reasonForVisit;
		name = "";
		reasonForVisit = "";

//		if(name.isBlank()) {
//			System.err.println("Appointment didn't get scheduled. Enter details again.");
//		}else if(!name.isBlank()) {
//			if(reasonForVisit.isBlank()) {
//				System.err.println("Please provide reason for visit.");
//			}else if(!reasonForVisit.isBlank()) {
//				System.out.println("Appointment scheduled. "+name.toUpperCase()+" will be called next.");
//				System.out.println("Thanks for being patient.");
//			}
//		}
		
		if(name.isBlank() && reasonForVisit.isBlank())
			System.err.println("Appointment didn't get scheduled. Enter details again.");
		else if(name.isBlank() || reasonForVisit.isBlank())
			System.err.println("Either name or reason for visit is blank. "
					+ "Please provide both details.");
		else if(!name.isBlank() && !reasonForVisit.isBlank()) {
			System.out.println("Appointment scheduled. "+name.toUpperCase()+" will be called next.");
			System.out.println("Thanks for being patient.");
		}
			
			
	}

}
