package com.sample.collections.custom.linkedlist;

public class CustLinkedList {
	private ListNode head;
	
	static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String arg[]) {
		CustLinkedList linkList = new CustLinkedList();
		linkList.head = new ListNode(10);
		ListNode secondNode = new ListNode(20);
		ListNode thirdNode = new ListNode(30);
		ListNode forthNode = new ListNode(40);
		ListNode fifthNode = new ListNode(50);
		
		linkList.head.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = forthNode;
		forthNode.next = fifthNode;
		
		linkList.display();
		
		linkList.add(60);
		linkList.display();
		
		linkList.addAtBegin(0);
		linkList.display();
		
		System.out.println("Length of the LinkedList : "+linkList.size());
		
		linkList.insertAtPosition(35, 5);
		linkList.display();
		
		linkList.deleteFirstNode();
		linkList.display();
	}

	private void display() {
		ListNode currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data +" -> ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	
	//add at the last
	public void add(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head==null) {
			head=newNode;
		}else {
			ListNode currNode = head;
			while(currNode.next!=null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
	}
	
	//add at beginning
	public void addAtBegin(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//size of the linked list
	public int size() {
		ListNode currNode = head;
		int count =0;
		while(currNode!=null) {
			count++;
			currNode = currNode.next;
		}
		return count;
	}
	
	//insert at particular position
	public void insertAtPosition(int value, int position) {
		ListNode newNode = new ListNode(value);
		
		if(position==1) {
			newNode.next =  head;
			head = newNode;
		}else {
			ListNode prevNode = head;
			int count =1;
			while (count<position-1) {
				prevNode = prevNode.next;
				count++;
			}
			ListNode currNode = prevNode.next;
			prevNode.next = newNode;
			newNode.next =currNode;
			
		}
	}
	
	//delete first Node
	public void deleteFirstNode() {
		
		
		if(head != null) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
		}
	}
}
