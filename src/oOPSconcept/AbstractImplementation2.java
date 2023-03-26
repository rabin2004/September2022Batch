package oOPSconcept;

public class AbstractImplementation2 extends AbstractClassMethodImplementation{

	public static void main(String[] args) {
		AbstractImplementation2 am = new AbstractImplementation2();
		am.abstractMethod1();
		am.abstractMethod2();
		am.test();

	}
	
	void abstractMethod2() {
		System.out.println("Abstract method implementation again");
	}

}
