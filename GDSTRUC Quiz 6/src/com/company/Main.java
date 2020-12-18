package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(21);
        tree.insert(12);
        tree.insert(0);
        tree.insert(43);
        tree.insert(54);
        tree.insert(65);
        tree.insert(89);
        tree.insert(105);
        tree.insert(41);

       // tree.traverseInOrder();
       // System.out.println(tree.get(21));
       System.out.println("Maximum value: " + tree.getMin());
       System.out.println("Minimum value: " + tree.getMax());

       tree.traverseInOrderDescending();
    }
}
