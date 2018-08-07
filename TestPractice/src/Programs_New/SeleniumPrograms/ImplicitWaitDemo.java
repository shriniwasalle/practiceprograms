package SeleniumPrograms;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWaitDemo {

	@Test
	public void testWithOutWait() {

		WebDriver driver = null;

		long lStartTime = 0;
		long lEndTime = 0;
		long difference = 0;

		try {
			System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			String baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
			driver.get(baseUrl);

			lStartTime = new Date().getTime();
			WebElement we = driver.findElement(By.className("w4-input"));
		} catch (Exception e) {

			System.out.println("exception = " + e);

			lEndTime = new Date().getTime();
			difference = lEndTime - lStartTime;
			System.out.println("Elapsed milliseconds-2: " + difference);
			System.out.println("Elapsed seconds-2: " + (float) difference / 1000);
			Assert.assertTrue(false);

		}

		driver.close();
		System.exit(0);
	}
}
