package org.ib.algorythms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    int value;
    List<Node> children;

    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int value) {
        this();
        setValue(value);
    }

    public Node(int value, Node parent) {
        this();
        setValue(value);
        parent.addChild(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public Node getMax() {

        Node maxNode = null;

        if (this.getChildren().size()==0) {
            maxNode = this;
        }
        else {
            int max = Integer.MIN_VALUE;

            for (Node child : this.getChildren()) {
                Node localMaxNode = child.getMax();
                if (max <= localMaxNode.value) {
                    maxNode = localMaxNode;
                    max = localMaxNode.value;
                }
            }

            if (max<=this.value)
                maxNode = this;
        }

        return maxNode;
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        Node mid1 = new Node(6, root);
        Node mid2 = new Node(3, root);

        Node leaf1 = new Node(10, mid1);
        Node leaf2 = new Node(7, mid1);
        Node leaf3 = new Node(9, mid2);
        Node leaf4 = new Node(8, mid2);

        Node max = root.getMax();
        System.out.println("max: " + max.value);
    }
}
