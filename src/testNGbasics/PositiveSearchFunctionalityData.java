package testNGbasics;

import org.testng.annotations.DataProvider;

public class PositiveSearchFunctionalityData {
	
	@DataProvider // annotation for TestNg to recognize data
	public String[] positiveSearchData() {
		String[] data = {	"samsung",
							"apple",
							"surface pro",
							"google pixel"
		};
		
		return data;
	}

}
