package oOPSconcept;

import java.util.Scanner;

public class InterfaceImplementation implements InterfaceConcept, Interface2{

	public static void main(String[] args) {
		InterfaceImplementation im = new InterfaceImplementation();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		System.out.println(im.add(a, b));
		System.out.println(im.substract(a, b));
		System.out.println(im.division(a, b));
		System.out.println(im.multiply(a, b));

	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double substract(double a, double b) {
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		return a*b;
	}

	@Override
	public double division(double a, double b) {
		return a/b;
	}

}
