package com.company.BuildBinaryTree;

//each node has left node and right node reference

import java.util.Scanner;

public class BuildBinaryTree {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();//this will create a tree using recursion
        //Tree traversal types :- pre-order, in-order, post-order etc.

        //See the images for better understanding :D
        //In order traversal :- LeftNodeRight LNR
        //Pre order traversal :- NodeLeftRight NLR
        //Post order traversal :- LeftRightNode LRN

        //let's code them:-
        printTreeInOrder(root);
        System.out.println();
        printTreePreOrder(root);
        System.out.println();
        printTreePostOrder(root);
    }

    public static void printTreeInOrder(Node root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.data + " ");
        printTreeInOrder(root.right);
    }

    public static void printTreePreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
    }

    public static void printTreePostOrder(Node root) {
        if (root == null) {
            return;
        }
        printTreePostOrder(root.left);
        printTreePostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node createTree() {
        Node root = null;
        System.out.print("Enter the data :");
        int data = scanner.nextInt();

        if (data == -1) {
            return null;
        }
        //else we make a node and do that stuff in left and right node
        root = new Node(data);
        System.out.print("Enter the left for " + data + " ,");
        root.left = createTree();

        System.out.print("Enter the right for " + data + " ,");
        root.right = createTree();

        return root;
    }

}

//each node has some data, we can make Node class generic to generalize but let's just make it easy for the time being.

class Node {
    Node left;
    Node right;

    int data;

    public Node(int data) {
        this.data = data;
    }

}

