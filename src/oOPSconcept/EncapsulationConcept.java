package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation: medicine inside a capsule - data hiding
	
	// Requirement: 
		// 1. private access modifier variables
		// 2. public getter and setter methods to access private variable
	
	private String ssn; // 123456789
	private String dob; // mm/dd/yyyy
	public String name;
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String getSSN() {
		return "*****".concat(ssn.substring(5));
	}
	
	public String getDob() {
		return dob.substring(6);
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String printName(String name) {
		this.name = name.toUpperCase();
		return this.name;
	}

}
