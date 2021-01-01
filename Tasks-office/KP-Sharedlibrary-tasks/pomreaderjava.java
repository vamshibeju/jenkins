package pomreader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class MyDomparser {

	public static void main(String argv[]) {
		try {
			// creating a file class and taking XML file as input
			File file = new File("C:\\Users\\vamshidhar\\eclipse-workspace\\pomreader\\pom.xml");
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
//	NodeList value = doc.getElementsbyTagName("groupId");

			NodeList nodeList = doc.getElementsByTagName("dependency");

			System.out.println(nodeList.getLength());

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
//	
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
//	Attr attr = (Attr) node.getAttributes().getNamedItem("type");

//	System.out.println("dependency: "+ eElement.getElementsByTagName("groupId").item(0).getTextContent());  
//	
//	System.out.println("artifactId: "+ eElement.getElementsByTagName("artifactId").item(0).getTextContent());  
//	System.out.println("version: "+ eElement.getElementsByTagName("version").item(0).getTextContent());  
//	

					if ((eElement.getElementsByTagName("artifactId").item(0).getTextContent().equals( "jsp-api"))
							&& (eElement.getElementsByTagName("version").item(0).getTextContent().equals("2.2"))) {
						System.out.println("it can download dependencies");
					} else {
						System.out.println("it cannot download dependencies");
//						System.out.println(eElement.getElementsByTagName("version").item(0).getTextContent());
//						System.out.println(eElement.getElementsByTagName("artifactId").item(0).getTextContent());
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
