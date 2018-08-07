package TestNGPrograms;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationUsingMethod {

	@Test(dataProvider = "SearchProvider")
	public void testA(String id, String name) {
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
	}

	@Test(dataProvider = "SearchProvider")
	public void testB(String salary) {
		System.out.println("Salary:" + salary);
	}

	@DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataProvider(Method m) {

		if (m.getName().equalsIgnoreCase("testA")) {
			return new Object[][] { { "123", "Shri1" }, { "456", "Shri2" } };
		} else {
			return new Object[][] { { "1000" }, { "2000" }, { "3000" } };
		}
	}

}
