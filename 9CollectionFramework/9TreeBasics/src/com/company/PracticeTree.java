package com.company;

import java.util.Scanner;

public class PracticeTree {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node createTree() {
        Node root = null;
        System.out.print("Enter the node's data = ");
        int data = scanner.nextInt();

        if (data == -1) {
            return null;
        }
        //else we make left and right references to the the current node and keep doing that,
        root = new Node(data);
        System.out.print("Left node for " + data + ", ");
        root.left = createTree();
        System.out.print("Right node for " + data + ", ");
        root.right = createTree();
        return root;
    }
}


class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }

}