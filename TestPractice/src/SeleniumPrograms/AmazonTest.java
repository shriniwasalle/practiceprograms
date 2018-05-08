package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		List<WebElement> catagoryItems = driver
				.findElements(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span/span"));

		for (WebElement items : catagoryItems) {

			if (items.getText().contains("Mobiles")) {

				action.moveToElement(items).build().perform();
				WebElement allMobiles = driver.findElement(By.xpath(
						"//span[text()='Mobiles, Tablets & More']/following::span[@class='nav-text' and text()='All Mobile Phones']"));
				allMobiles.click();

				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Basic Mobiles']")));

				WebElement basicMobiles = driver.findElement(By.xpath("//img[@alt='Basic Mobiles']"));
				basicMobiles.click();
				Thread.sleep(5);
				List<WebElement> allBasicMobiles = driver.findElements(By.xpath(
						".//*[contains(@id,'result')]/div/div[3]/div[2]/span[1]/parent::div/preceding-sibling::div/a/h2"));

				for (WebElement allPhones : allBasicMobiles) {
					if (allPhones.isDisplayed() == true) {
						System.out.println(allPhones.getText());
					} else {
						try {
							
						} catch (StaleElementReferenceException e) {
							System.out.println("");
						}
					}

				}
			}
		}
	}
}
