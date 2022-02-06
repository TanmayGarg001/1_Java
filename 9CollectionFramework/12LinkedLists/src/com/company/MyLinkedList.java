package com.company;

//See the real java code and Java has implemented doublyLinkedlist in collection framework.

public class MyLinkedList {

    Node head;

    public void add(int data) {
        //it will throw nullPointerException if the LinkedList is empty so we add an if condition
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //singly linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

}


