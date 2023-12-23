//Test Parameterization - To pass multiple data to the application at runtime.
//			It's also Data Driven testing.
//
//
//Type of Parameterization - 
//1- with the help of "Parameters annotation and TestNG XML file".
//2- with the help  of "DataProvider annotations".

package Test_cases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {
	@Test
	@Parameters("browser")
	public void testcaseone(String browser) {
		System.out.println("Test user " + browser);
	}
	
	@Test
	@Parameters({"username","password"})
	public void testcasetwo(String username , String password) {
		System.out.println("Test username" + username);
		System.out.println("Test user password" + password);
	}
}
