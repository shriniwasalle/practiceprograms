package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BUSINESS DATA\\Softwares\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		// This is for hiding the message in browese we normally get while running the test case "Chrome is being 
		// controlled by an automation test software"
		options.addArguments("disable-infobars");
		
		// This will run your test case in Headless mode
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}
	}
}
