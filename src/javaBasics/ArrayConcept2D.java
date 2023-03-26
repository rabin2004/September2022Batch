package javaBasics;

public class ArrayConcept2D {

	public static void main(String[] args) {
		// Creating 2D
//		String[][] customer = new String[3][2]; // [3] -> number of rows | [2] -> number of column
//		// inserting data
//		// 1st row
//		customer[0][0] = "David";
//		customer[0][1] = "M";
//		// 2nd row
//		customer[1][0] = "Mary";
//		customer[1][1] = "T";
//		// 3rd row
//		customer[2][0] = "Gary";
//		customer[2][1] = "K";
		
//		System.out.println("First customer: "+customer[0][0].concat(" "+customer[0][1]));
//		System.out.println("Third customer: "+customer[2][0].concat(" "+customer[2][1]));
		
		// increasing number of column
		// #creating 2D Array
		String customer[][] = {{"David","M","M"},{"Mary","T","F"},{"Gary","K","M"}};
		
		int rowCount = customer.length;
//		System.out.println("Row count: "+rowCount);
//		System.out.println("First row: "+customer[0]); // representation of 1st row which is having 2 cells
		int columnCount = customer[1].length;
//		System.out.println("Column count: "+columnCount);

		for(int i=0; i<rowCount; i++) { // 1st loop dealing with traversing rows
			for(int j=0; j<columnCount; j++) { // 2nd loop dealing with traversing columns
				System.out.print(customer[i][j]+" ");
			}
			System.out.println();
			System.out.println("---------------");
		}
	}

}
