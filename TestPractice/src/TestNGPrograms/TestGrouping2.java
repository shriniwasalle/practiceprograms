package TestNGPrograms;

import org.testng.annotations.Test;

public class TestGrouping2 {

	@Test(groups="smoke")
	public void test1() {
		System.out.println("In TestGrouping2 test1");
	}
	
	@Test(groups="sanity")
	public void test2() {
		System.out.println("In TestGrouping2 test2");
	}
}
