package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeExtensionCode {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\Latest_chromedriver_win32\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File("D:\\BUSINESS DATA\\Softwares\\Toggl-Button_-Productivity-&-Time-Tracker_v1.11.1.crx"));
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();

		for (String w : window) {
			if (w != parentWindow) {
				driver.switchTo().window(w);
				System.out.println(driver.getTitle());
			}
		}

		System.out.println(driver.getTitle());
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		driver.switchTo().window("");
	}
}
