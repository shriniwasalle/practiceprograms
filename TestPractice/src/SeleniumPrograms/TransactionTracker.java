package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionTracker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://commerce.spscommerce.com/auth/login");
		driver.manage().window().maximize();
		
		ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                    	System.out.println("Waiting");
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
                
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
        System.out.println("Main1:"+driver.getTitle());
        
		driver.switchTo().frame(0);
		System.out.println("Login frame:"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("salle@spscommerce.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Chinu@0143");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(4000);
		
		System.out.println("Launchpad frame:"+driver.getTitle());
		
		//WebElement clickOntransactionTracker = driver.findElement(By.xpath("//span[text()='Transaction Tracker']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", clickOntransactionTracker);
		
		//List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));

		//System.out.println(iframes.size());

		/*for (int i = 0; i < iframes.size(); i++) {

			try {
				Thread.sleep(1000);
				driver.switchTo().frame(1);
				driver.switchTo().frame(0);
				Thread.sleep(1000);
				System.out.println("Switched");
				driver.findElement(By.xpath("//span[contains(text(),'Transaction')]")).click();

			} catch (NoSuchFrameException e) {
				System.out.println("Handled");
			}
		}*/

		// driver.findElement(By.xpath("//span[text()='Transaction Tracker']")).click();

		//

	}

}
