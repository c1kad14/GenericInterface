package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.models.Node;
import com.parser.XmlParser;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Start point");
        
        FileInputStream is = null;
		File f = new File("/home/alex/test.xml"); // Just hardcoded path to the xml file
		try {
			is = new FileInputStream(f);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxFactory.newSAXParser();
			XmlParser parser = new XmlParser();
			saxParser.parse(is, parser);
			Node parent = parser.getXmlParent();
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
    }
}
