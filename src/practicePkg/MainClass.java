package practicePkg;

import java.util.Scanner;

public class MainClass extends SubstractClass{
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		MainClass mc = new MainClass();
		mc.add(a, b);
		mc.substract(a, b);
	}
}
