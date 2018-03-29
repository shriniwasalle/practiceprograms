package SeleniumPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "window.location= 'https://www.facebook.com/'";
		String title = "return document.title";
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript(url);
		System.out.println(js.executeScript(title).toString());
	}
}
