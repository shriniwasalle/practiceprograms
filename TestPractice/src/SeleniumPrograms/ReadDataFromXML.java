package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadDataFromXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		File file = new File("C:\\Users\\shriniwas.alle\\git\\practiceprograms\\TestPractice\\Test.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document doc = dBuilder.parse(file);

		NodeList lxml = doc.getChildNodes();
		Node nxml = lxml.item(0);

		Element element = (Element) nxml;
		String urlpath = element.getElementsByTagName("URL").item(0).getTextContent();

		System.setProperty("webdriver.chrome.driver", "D:\\BUSINESS DATA\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(urlpath);
		driver.manage().window().maximize();

	}

}
