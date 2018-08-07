package SeleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BUSINESS DATA\\Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");

		List<WebElement> elements = driver.findElements(By.tagName("a"));

		for (WebElement pageLink : elements) {
			String link = pageLink.getAttribute("href");
			System.out.println(link);
			try {
				GetResponseCode.verifyURL(link);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total no. of links : " + elements.size());
		GetResponseCode.getInvalidCount();
	}
}

class GetResponseCode {

	static int invalidLinks;

	public static void verifyURL(String link) throws IOException {
		try {

			URL url = new URL(link);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setConnectTimeout(5000);
			connection.connect();

			if (connection.getResponseCode() == 200) {
				System.out
						.println(url + " : " + connection.getResponseCode() + " : " + connection.getResponseMessage());
			} else if (connection.getResponseCode() == connection.HTTP_NOT_FOUND) {
				System.out.println(url + " : " + connection.getResponseCode() + " : " + connection.HTTP_NOT_FOUND);
				invalidLinks++;
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	public static void getInvalidCount() {
		System.out.println("Invalid Links count : " + invalidLinks);
	}
}
