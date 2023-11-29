package com.wm_practice.utill;

/*
 * Program:Form a custom Linked List which store a value of integer
 * 
 * Agorithom
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity
 */

public class CustomLinkedList {

	Node head,tail;
	class Node{
		int data;
		Node next;
		
		Node(int x){
			data= x;
			next = null;
		}
	}
	
	public void push(int data) {
		
		Node new_node = new Node(data);
		if(head==null) {
			head=new_node;
			tail=new_node;
		}else {
			tail.next=new_node;
			tail=new_node;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList list = new CustomLinkedList();
		
		int[] a= {4,2,7,4,8,1,5};
		for(int i: a) {
			list.push(i);
		}
		list.printList();
	}

}
