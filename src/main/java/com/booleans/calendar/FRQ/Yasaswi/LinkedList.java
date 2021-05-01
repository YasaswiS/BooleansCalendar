package com.booleans.calendar.FRQ.Yasaswi;

import java.util.ArrayList;

public class LinkedList{

    // create an object of Node class
    // represent the head of the linked list
    Node head;

    // static inner class
    static class Node {
        int value;

        // connect each node to next node
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
   public Node next(){
       if (next != null) return next;
       return null;

       }
    }

    public Node next(){
        return head.next;
    }

    public ArrayList<String> traverse(){
        ArrayList<String> vals = new ArrayList<String>();
        while (head != null) {
            vals.add(head.value + " ");
            head = head.next;
        }
        return vals;
    }

    public static void main(String[] args) {

        // create an object of LinkedList
        LinkedList linkedList = new LinkedList();

        // assign values to each linked list node
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // connect each node of linked list to next node
        linkedList.head.next = second;
        second.next = third;

        System.out.println(linkedList.next());
        System.out.println(linkedList.traverse());


    }
}