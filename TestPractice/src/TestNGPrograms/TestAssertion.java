package TestNGPrograms;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class TestAssertion {
	
	Assertion hardAssert = new Assertion();
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void testHardAssert() {
		
		System.out.println("I'm in Hard Assert");
		
		Assert.assertEquals(3, 3);
		Assert.assertTrue(true, "Assertion is true");
		Assert.assertFalse(true, "Assertion is true");
		System.out.println("First Hard Assert is Passed");
		
		Assert.assertEquals(2, 3);
		System.out.println("Second Hard Assert is failed");
	}
	
	@Test
	public void testSoftAssert() {
		
		System.out.println("I'm in Soft Assert");
		
		softAssert.assertEquals(3, 3);
		System.out.println("First Soft Assert is Passed");
		
		softAssert.assertEquals(2, 3);
		System.out.println("Second Soft Assert is failed");
		
		softAssert.assertEquals("Srinivas", "Shriniwas");
		System.out.println("Third Soft Assert is failed");
		
		// This statement will capture all the failed asserts and give AssertionError, and report test case failed
		softAssert.assertAll();
	}
}
