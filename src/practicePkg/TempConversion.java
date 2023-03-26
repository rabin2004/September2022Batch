package practicePkg;

public class TempConversion {
	
	public double tempC, tempF;
	private String a = "Temp Conversion";
	String operation;
	protected String d;
	
	public double convertToF() {
		System.out.println(a);
		return (tempC+32)*(9/5);
	}
	
	public double convertToC() {
		System.out.println(a);
		return (tempF-32)*5/9;
	}
	
	void printOp() {
		System.out.println(operation);
	}
	
	protected void printOp1() {
		System.out.println(d);
	}
}
