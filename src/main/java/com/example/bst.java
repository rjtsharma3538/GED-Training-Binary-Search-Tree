package com.example;

public class bst<T extends Comparable<T>> {
    Node<T> root;

    public bst() {
        this.root = null;
    }

    public void insert(T data) {
        root = insertion(root, data);
    }

    public void search(T data) {
        if(searching(root, data))
            System.out.println("Value " + data + " is present in bst");
        else 
            System.out.println("Value " + data + " is not present in bst");
    }

    public void display() {
        Traversal(root);
    }

    public int size()
    {
        return numberOfNodes(root);
    }

    private int numberOfNodes(Node<T> root)
    {
        if(root==null)
            return 0;
        return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
    }

    private void Traversal(Node<T> root) {
        if (root == null)
            return;

        T lchild = null, rchild = null;
        if (root.left != null) {
            lchild = root.left.data;
        }
        if (root.right != null)
            rchild = root.right.data;
        System.out.println(
                "root = " + root.data + " and its left-child is " + lchild + " and its right child is " + rchild);
        Traversal(root.left);
        Traversal(root.right);
    }

    private Node<T> insertion(Node<T> root, T data) {
        if (root == null) {
            Node<T> myNewNode = new Node<T>(data);
            return myNewNode;
        }
        if (data.compareTo(root.data) < 0)
            root.left = insertion(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertion(root.right, data);
        return root;
    }

    private boolean searching(Node<T> root, T data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        if (root.data.compareTo(data) > 0)
            return searching(root.left, data);
        return searching(root.right, data);
    }
}
