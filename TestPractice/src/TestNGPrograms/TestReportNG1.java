package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestReportNG1 {
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("In BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("In BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In BeforeMethod");
	}
	
	@Test
	public void test1ReportNG1() {
		System.out.println("In Test1 ReportNG1");
	}
	
	@Test
	public void test1ReportNG2() {
		System.out.println("In Test1 ReportNG2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In afterMethod");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("In afterClass");
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("In afterTest");
		
	}
}
