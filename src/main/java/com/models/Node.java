package com.models;

import java.util.List;

public class Node {
    private String name;
    private String value;
    private List<Node> children;
    private List<Attribute> attributes;
    private Node parent;

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

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
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
