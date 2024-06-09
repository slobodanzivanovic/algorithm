package com.slobodan.lists;

class Node {
    int data;
    Node1 next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node1 head = null;

    public void add(int data) {
        Node1 node1 = new Node1(data);

        Node1 current = head;

        if (head == null)
            head = node1; // if list is empty set set the head to the newly created node1.
        else {
            while (current.next != null) { // iterate through the list until it reaches that last node1 (the one whose
                // "next" reference is null)
                current = current.next;
            }
            // this is simply reference of the last node1 to the new node1
            current.next = node1; // attach new node1 to the end
        }
    }

    public void addFirst(int data) {
        Node1 node1 = new Node1(data);
        node1.next = head; // set the next reference of the new node1 to point to the current "head" node1

        head = node1; // update the "head" reference to point to the newly added node1
    }

    public void delete(int data) {
        Node1 current = head; // Start traversing the list from the head

        // traverse the list until the next node is null (end of the list) or until
        // the next nodes data matches the given data
        while (current.next != null && current.next.data != data) {
            current = current.next; // move to the next node
        }

        // if a node with the given data is found, update the next reference of the
        // current node to skip the node to be deleted
        if (current.next != null) {
            current.next = current.next.next; // skip the node to be deleted
        }
    }

    public void print() {
        Node1 current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();

        linkedList1.add(3);
        linkedList1.add(1);
        linkedList1.add(6);

        linkedList1.addFirst(4);

        linkedList1.print();

        linkedList1.delete(1);

        linkedList1.print();
    }
}
