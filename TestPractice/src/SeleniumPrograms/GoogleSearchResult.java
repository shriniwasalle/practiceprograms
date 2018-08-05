package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResult {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@value='Google Search']")).click();

		String results = driver.findElement(By.xpath("//*[@id='resultStats']")).getText();
		System.out.println(results);
		
		//String newValue = results.replaceAll("\\D", "");
		
		String [] str = results.split(" ");
		
		for (int i = 0; i < str.length;) {
			System.out.println("Total results:" +str[1]);
			break;
		}
	}

}
