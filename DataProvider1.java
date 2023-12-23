//with the help  of "DataProvider annotaions".
//	-- Data provider is annotation in TestNG.It return the dataset in form of 2D 	array. [1][2] - 1 represent dataset and 2 array contain the parameter.

package Test_cases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

		@Test(dataProvider ="getData")
		public void testAddition(int actual , int expected) {
			int actualvalue = actual+20;
			Assert.assertEquals(actualvalue, expected);
		}
		@DataProvider
		public Object[][] getData(){
			return new Object[][] {
				{100,120},
				{200,220},
				{250,270},
				{300,310},
			};
		}
}
