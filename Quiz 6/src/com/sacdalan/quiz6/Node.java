package com.sacdalan.quiz6;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    public Node(int _data) {
        data = _data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value > data) {
            // switches the left and right side so left is the higher side than the right
            if (leftChild == null) {
                leftChild = new Node(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new Node(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrderDescending() {
        // left subtree
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }

        // print current node (root or subtree)
        System.out.println("Data: " + data);

        // right subtree
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value > data) {
            if (leftChild != null) {
                return  leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
                return  rightChild.get(value);
            }
        }

        return null;
    }

    public void getMin(){
        if (rightChild != null){
            rightChild.getMin();
        }
        else{
            System.out.println("Minimum Value : " + data);
        }
    }

    public void getMax(){
        if (leftChild != null){
            leftChild.getMax();
        }
        else{
            System.out.println("Maximum Value : " + data);
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "DATA :" + data +
                '}';
    }
}
