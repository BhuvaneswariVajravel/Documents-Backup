package com.customize.linkedlist;

public class SinlgeLinkedList {
	Node head ;
	
	class Node{
		int data ;
		Node next ;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//1. insert a new node at front of list
	
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode ;
	}
	//inserting new node after the given previous node
public void insertAfter(Node previous ,int newData) {
	if(previous== null) {
		System.out.println("The given previous node cannot be null");
        return;
	}
	Node newNode = new Node(newData);
	newNode.next = previous.next ;
	previous.next = newNode ;
	
}
public void append(int data) {
	Node newNode = new Node(data);
	if (head == null)
    {
        head = new Node(data);
        return;
    }
	newNode.next = null;
	/* 5. Else traverse till the last node */
    Node last = head;
    while (last.next != null)
        last = last.next;

    /* 6. Change the next of last node */
    last.next = newNode;
    return;
}
public void printList()
{
    Node tnode = head;
    while (tnode != null)
    {
        System.out.print(tnode.data+" ");
        tnode = tnode.next;
    }
}
}
