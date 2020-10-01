package com.ssuriyan.java.programs;

/*
 * Singly Linked List Library
 * No error checks duh
 */

import java.util.*;

/*
 * @author SURIYAN S (suriyansub710@gmail.com)
 */

public class LinkedList {
    
    public static class Node {

        int data;
        Node nextNode;

        public Node() {}
        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }

    }

    Node head;

    public LinkedList() {

        head = null;

    }

    /*
     * Adds to the front of the list
     */
    public void add(int data) {

        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.nextNode = this.head;
            this.head = newNode;
        }

    }

    /*
     * Removes a node in the given position
     */ 

    public void remove(int position) {

        int count = 0;
        Node temp = this.head;
        Node prev = null;

        if (position == 0) {
            this.head = this.head.nextNode;
        } else {
            while (count != position) {
                count++;
                prev = temp;
                temp = temp.nextNode;
            }
        }
        
        prev.nextNode = temp.nextNode;
        System.out.print("After Deletion ");
        this.print();
    }

    /*
     * Prints from head to end
     */
    public void print() {

        Node temp = this.head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
        System.out.println("");
    }

}