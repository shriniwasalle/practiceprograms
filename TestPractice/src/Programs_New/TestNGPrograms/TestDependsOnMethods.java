package TestNGPrograms;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestDependsOnMethods {
	
	
	@Test
	public void abc() {
		System.out.println("In ABC method");
	}
	
	@Test
	public void xyz() {
		System.out.println("In XYZ method");
	}
	
	@Test(dependsOnMethods="abc", priority=0)
	public void pqr() {
		System.out.println("In PQR method");
	}
	
	@Test(priority=1)
	public void lmn() {
		System.out.println("In lmn method");
	}
	
	
}
