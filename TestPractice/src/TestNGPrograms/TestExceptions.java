package TestNGPrograms;

import org.testng.annotations.Test;

public class TestExceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test() {
		System.out.println("Before Arithmetic test");
		
		int i = 10/0;
		
		// This will not execute
		System.out.println("After Arithmetic test"+i);
	}
}
