package TestNGPrograms;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test
	public void firstTest() {
		System.out.println("In first test");
	}
	
	@Test(priority=0)
	public void secondTest() {
		System.out.println("In second test");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("In third test");
	}
	
	@Test
	public void fourthTest() {
		System.out.println("In fourth test");
	}
}
