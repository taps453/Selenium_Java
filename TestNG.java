package Test_cases;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNG {
	@AfterSuite
	public void validLogin() {
		System.out.println("Successfully logged in");
	}

	@AfterClass
	public void logout() {
		System.out.println("logged out");
	}

//	@Test(enabled = false)
//	public void CheckIN() {
//		System.out.println("1");
//	}
	@Test
	public void skipped() {
		System.out.println("Skiping");
		throw new SkipException("Skippng this test case");
	}

	@BeforeTest
	public void Checkout() {
		System.out.println("2");
	}

	@Test
	public void printing() {
		System.out.println("tttt");
	}
}
