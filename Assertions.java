//Assertions is performed to compare the actual result with the expected result.
//Type of assertions -
//1- Hard assertion
//2- Soft assertion

package Test_cases;

import org.testng.Assert;
import org.testng.annotations.*;

public class Assertions {
	
	@Test
	public void testone() {
		System.out.println("1");
		//assertEqual(String actual , String expected)
		Assert.assertEquals("Anand", "Anand");
	}

	@Test
	public void testtwo() {
		System.out.println("2");
		//assertEqual(String actual , String expected , String message)
		Assert.assertEquals(400,400);
	}

	@Test
	public void testthree() {
		//assertEqual(boolean actual , boolean expected)
		System.out.println("3");
		Assert.assertTrue(true);
	}

	@Test
	public void testfour() {
		System.out.println("4");
		//assertTure(condition , message)
		Assert.assertTrue(false,"This is the fail method");
	}
	@Test
	public void testfive() {
		System.out.println("5");
		//assertFalse(condition)
		Assert.assertFalse(false);
	}
	
	@Test
	public void testsix() {
		System.out.println("6");
		//assertFalse(condition , message)
		Assert.assertFalse(true,"this is the fail method");
	}


}








//13
