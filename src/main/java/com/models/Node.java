package com.models;

import java.util.LinkedList;

public class Node {
    private String name;
    private String value;
    private LinkedList<Node> children;
    private LinkedList<Attribute> attributes;
    private Node parent;
    
    public Node(String name) {
    	this.name = name;
    	children = new LinkedList<Node>();
    	attributes = new LinkedList<Attribute>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedList<Node> getChildren() {
        return children;
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }

    public LinkedList<Attribute> getAttributes() {
        return attributes;
    }

    public boolean hasAttributes() {
        return attributes.size() > 0;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
