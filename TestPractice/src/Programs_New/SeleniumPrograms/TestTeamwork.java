package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTeamwork {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spsc.teamwork.com/launchpad/login/projects?continue=https%3A%2F%2Fspsc.teamwork.com%2F%23%2Fdashboard%2Factivity");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nameoremail")).sendKeys("salle@spscommerce.com");
		driver.findElement(By.id("passwordfield")).sendKeys("salle@spscommerce.com");
		
		
		
		
	}
	
}
