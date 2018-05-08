package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement month = driver.findElement(By.id("month"));
		Select dSelect = new Select(month);
		dSelect.selectByIndex(1);
		dSelect.selectByValue("3");
		dSelect.selectByVisibleText("Jan");
		
		List<WebElement> months = dSelect.getOptions();

		for (WebElement dMonth : months) {
			System.out.println(dMonth.getText());
		}

	}
}
