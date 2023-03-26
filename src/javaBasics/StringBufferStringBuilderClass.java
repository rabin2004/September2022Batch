package javaBasics;

public class StringBufferStringBuilderClass {
	// StringBuffer & StringBuilder -> String helper class

	public static void main(String[] args) {
		String a = "Apple is good for health.";
		
//		StringBuffer sb = new StringBuffer(a);
//		System.out.println(sb.reverse());
//		sb.deleteCharAt(a.length()-1);
//		System.out.println(sb);
//		sb.insert(a.length()-1, "!");
//		System.out.println(sb);
		
		StringBuilder sbu = new StringBuilder(a);
//		System.out.println(sbu.reverse());
		sbu.deleteCharAt(a.length()-1);
//		System.out.println(sbu);
		sbu.insert(a.length()-1, "!");
		System.out.println(sbu);
		
	}

}
