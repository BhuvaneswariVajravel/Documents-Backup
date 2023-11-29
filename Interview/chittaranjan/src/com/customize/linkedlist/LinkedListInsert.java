package com.customize.linkedlist;

public class LinkedListInsert<E> {
Node head;
class Node{
	E data;
	Node next;
	Node(E d){
		data = d;
		next = null;
	}
}
public void insert(E data) {
	Node newNode = new Node(data);
	newNode.next = null;
	if(this.head == null) {
		head = newNode ;
	}else {
		Node last = this.head;
		while(last.next != null) {
			last = last.next ;
		}
		last.next = newNode ;
	}
	
}
public void print(LinkedListInsert<E> list) {
	Node currNode = list.head ;
	System.out.println("LinkedListInsert");
	while(currNode !=null) {
		System.out.println("LinkedListInsert data::"+currNode.data);
		currNode = currNode.next;
	}
}
public static void main(String[] args) {
	LinkedListInsert<Integer> list = new LinkedListInsert<>();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.insert(40);
	list.insert(50);
	list.print(list);
}

}
