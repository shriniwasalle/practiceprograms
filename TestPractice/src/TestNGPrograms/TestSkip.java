package TestNGPrograms;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {

	@Test
	public void test1() {
		
		System.out.println("This is Test 1");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("This is Test 3");
	}

	@Test
	public void test2() {
		System.out.println("This is Test 2");
		throw new SkipException("Skip Exception is thrown");
	}

	
}
