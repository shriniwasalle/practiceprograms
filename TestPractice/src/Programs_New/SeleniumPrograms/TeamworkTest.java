package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeamworkTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\shriniwas.alle\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://spsc.teamwork.com/launchpad/login/projects");

		driver.manage().window().maximize();

		driver.findElement(By.id("nameoremail")).sendKeys("salle@spscommerce.com");

		driver.findElement(By.id("passwordfield")).sendKeys("Shrini@0143");

		driver.findElement(By.xpath("//button")).click();

		Thread.sleep(4000);

		driver.get("https://spsc.teamwork.com/#tasks/13982194");

		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='commentContainer']//span")));

		WebElement element = driver.findElement(By.xpath("//div[@class='commentContainer']//span"));
		element.click();

		driver.switchTo().frame(0);
		
		((JavascriptExecutor) driver).executeScript(
               "arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//body[@id='tinymce']/div")));
		
		WebElement move = driver.findElement(By.xpath("//body[@id='tinymce']/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(move);
		actions.click();
		actions.sendKeys("Alle");
		actions.build().perform();

	}
}
