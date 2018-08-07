package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationUsingIContext {

	@Test(priority = 1, groups = { "A", "B" })
	public void test() {
		System.out.println("In main");
	}

	@Test(dataProvider = "search", groups = "A")
	public void testA(String id, String name) {
		System.out.println(id);
		System.out.println(name);
	}

	@Test(dataProvider = "search", groups = "B")
	public void testB(String salary) {
		System.out.println(salary);
	}

	@DataProvider(name = "search")
	public Object[][] getDataFromDataprovider(ITestContext c) {
		Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
			if (group.equalsIgnoreCase("A")) {
				groupArray = new Object[][] { { "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" } };
				break;
			} else if (group.equalsIgnoreCase("B")) {
				groupArray = new Object[][] { { "Canada" }, { "Russia" }, { "Japan" } };
			}
			break;
		}
		return groupArray;
	}
}
