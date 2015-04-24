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
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(Comparable value) {
        Node newRoot = new Node(value);
        this.root = newRoot;
    }

    public void removeAll() {
        this.root = null;
    }

    public void add(Comparable value) {
        root = insert(value, root);
    }

    private Node insert(Comparable value, Node node) {
        if(node == null) {
            node = new Node(value);
        } else if(value.compareTo(node.getValue()) < 0) {
            node.setLeft(insert(value, node.getLeft()));
        } else if(value.compareTo(node.getValue()) >= 0) {
            node.setRight(insert(value, node.getRight()));
        }

        return node;
    }
    // needs a remove and a search through
}
