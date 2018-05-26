package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class firstPracticeTest {

	@Test
	public void testChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement link_Home = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2'][@id='nav-link-shopall']"));

		Actions action = new Actions(driver);

		action.moveToElement(link_Home).build().perform();

		List<WebElement> listOfElement = driver.findElements(By.xpath(
				"//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/following::span[@class='                    nav-hasPanel                              nav-item']"));

		for (WebElement ele : listOfElement) {
			String list = ele.getAttribute("aria-label");

			// System.out.println(list);

			if (list.equalsIgnoreCase("Mobiles, Computers")) {

				action.moveToElement(ele).build().perform();

			}

		}

		List<WebElement> listOfElementFromSecondMenu = driver
				.findElements(By.xpath("//div[@class='nav-panel']/following::span[@class='nav-text']"));

		for (WebElement ele : listOfElementFromSecondMenu) {
			String list = ele.getAttribute("innerText");

			if (list.equalsIgnoreCase("All Mobile Phones")) {

				action.moveToElement(ele).click().build().perform();
				System.out.println("Done");
				break;
			}

		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Basic Mobiles']")));
		driver.findElement(By.xpath("//img[@alt='Basic Mobiles']")).click();

	}
}
