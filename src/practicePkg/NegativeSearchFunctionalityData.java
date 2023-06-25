package practicePkg;

import org.testng.annotations.DataProvider;

public class NegativeSearchFunctionalityData {
	
	@DataProvider // annotation for TestNg to recognize data
	public String[] negativeSearchData() {
		String[] data = {	"&%*&%*^%648658758758712344",
							"&%*&%*^%64865875875871234455",
							"&%*&%*^%648658758758712344688"
		};
		
		return data;
	}

}
