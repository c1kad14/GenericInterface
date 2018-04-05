package com.parser;

import java.util.LinkedList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.models.Attribute;
import com.models.Node;

public class XmlParser extends DefaultHandler {
	
	private LinkedList<Node> nodeList;
	private Node theParent;
	
	public XmlParser() {
		nodeList = new LinkedList<Node>();
	}
	
	public Node getXmlParent() {
		return theParent;
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) 
			throws SAXException {
		Node node = new Node(qName);
		if (attributes != null && attributes.getLength() > 0) {
			for (int i = 0; i < attributes.getLength(); i++) {
				Attribute attribute = new Attribute(attributes.getQName(i), attributes.getValue(i));
				node.getAttributes().add(attribute);
			}
		}
		nodeList.addLast(node);
		System.out.println("<" + qName + ">");
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		Node node = nodeList.removeLast();
		if (nodeList.peekLast() != null) {
			nodeList.peekLast().getChildren().addLast(node);
		}
		else {
			theParent = node;
		}
		System.out.println("</" + qName + ">");
	}

}