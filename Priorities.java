package Test_cases;

import org.testng.annotations.*;

public class Priorities {

	@Test
	public void testone() {
		System.out.println("1");
	}

	@Test(priority = 1)
	public void testtwo() {
		System.out.println("2");
	}

	@Test(priority = 2)
	public void testthree() {
		System.out.println("3");
	}

	@Test(priority = 3)
	public void testfour() {
		System.out.println("4");
	}

}
