package TestNGPrograms;

import org.testng.annotations.Test;

public class TestGrouping1 {
	
	@Test(groups="smoke")
	public void test1() {
		System.out.println("In TestGrouping1 test1");
	}
	
	@Test(groups="sanity")
	public void test2() {
		System.out.println("In TestGrouping1 test2");
	}
	
	@Test(groups="smoke")
	public void test3() {
		System.out.println("In TestGrouping1 test3");
	}
	
	@Test(groups="functional")
	public void test4() {
		System.out.println("In TestGrouping1 test4");
	}
}
