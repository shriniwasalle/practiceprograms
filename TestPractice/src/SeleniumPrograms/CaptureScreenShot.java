package SeleniumPrograms;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd SSS");

	public static String captureScreen(WebDriver driver) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		// File src = screen.getScreenshotAs(OutputType.FILE);
		String src = screen.getScreenshotAs(OutputType.BASE64);

		/*
		 * String dest =
		 * System.getProperty("user.dir")+"//Test-ScreenShots//"+screenName+".png";
		 * 
		 * File target = new File(dest); 
		 * FileUtils.copyFile(src, target);
		 */
		String dest = "data:image/jpg;base64, " + src;

		return dest;
	}

}
