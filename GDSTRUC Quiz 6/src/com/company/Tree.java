package com.company;

public class Tree {

    private Node root;

    public void insert(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }
    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
    public Node getMin() // get left child
    {
        Node temp = root;
        while (temp.getLeftChild() != null)
        {
            temp = temp.getLeftChild();
        }
        return temp;
    }

    public Node getMax() // get right child
    {
        Node temp = root;
        while (temp.getRightChild() != null)
        {
            temp = temp.getRightChild();
        }
        return temp;
    }

    public void traverseInOrderDescending()
    {
        Node rootLeftChild = root.getLeftChild();
        Node rootRightChild = root.getRightChild();

        if (rootLeftChild != null) {
            rootLeftChild.traverseInOrder();
        }
        if (rootRightChild != null)
        {
            rootRightChild.traverseInOrder();
        }
    }
}
