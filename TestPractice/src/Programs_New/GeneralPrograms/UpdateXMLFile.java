package GeneralPrograms;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UpdateXMLFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File(
				"D:\\BUSINESS DATA\\3PL\\Generic Test File\\Murdoch's Ranch and Home\\Input-Murdoch's Ranch and Home-856.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document doc = dBuilder.parse(file);

		// Get the staff element by tag name directly
		Node shipmentHeader = doc.getElementsByTagName("ShipmentHeader").item(0);

		NodeList list = shipmentHeader.getChildNodes();

		for (int i = 0; i < list.getLength(); i++) {

			Node node = list.item(i);

			// get the salary element, and update the value
			if (node.equals("TradingPartnerId")) {
				node.setTextContent("BD8ALLTESTING00");
			}

		}

		System.out.println("Done");
	}
}