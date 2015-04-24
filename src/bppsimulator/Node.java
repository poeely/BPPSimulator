/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bppsimulator;

/**
 *
 * @author Paul
 */
public class Node {
    private Node left;
    private Node right;
    private Comparable value;

    public Node(Comparable value) {
        this.value = value;
    }

    public Node(Node left, Node right, Comparable value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    
    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }


    public void setRight(Node right) {
        this.right = right;
    }

    public Comparable getValue() {
        return value;
    }

    public void setValue(Comparable value) {
        this.value = value;
    }
}
