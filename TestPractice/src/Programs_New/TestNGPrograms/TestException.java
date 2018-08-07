package TestNGPrograms;

import org.testng.annotations.Test;

public class TestException {
	@Test(expectedExceptions=ArithmeticException.class) 
	public void test1() {
		
		System.out.println("Arithmetic Exception Caught");
		int i = 1/0;
		System.out.println("Hello");
		
	}
}
