//Grouping categorise the test cases based on the requirement.
//@Test(groups = {"groupname"}) 
//user can maintain the excution of groups via testing.xml file
//<include> - it will include the test cases.
//<exclude> - it will exclude the test cases

package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test(groups = "Smoke")
	public void testone() {
		System.out.println("1");
	}

	@Test(groups = "Smoke")
	public void testtwo() {
		System.out.println("2");
	}

	@Test(groups = "sanity")
	public void testthree() {
		System.out.println("3");
	}

	@Test(groups = "sanity")
	public void testfour() {
		System.out.println("4");
	}

	@Test(groups = "sanity")
	public void testfive() {
		System.out.println("5");
	}

	@Test(groups = "Smoke")
	public void testsix() {
		System.out.println("6");
	}

}
