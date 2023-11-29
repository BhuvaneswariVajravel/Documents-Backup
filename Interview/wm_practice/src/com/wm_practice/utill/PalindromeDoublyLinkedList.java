package com.wm_practice.utill;

/*
 * Program:Check palindrome with singly linked list characters.
 * 
 * Agorithom
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * Note: if we use stack auxilary space will taken by O(n)
 */

public class PalindromeDoublyLinkedList {

	Node head, tail, slow, fast, second;

	class Node {
		char data;
		Node next;
		Node prev;

		Node(char x) {
			data = x;
			next = null;
			prev = null;
		}
	}

	public void push(char data) {

		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			new_node.prev=tail;
			tail = new_node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	
	
	void checkPalindromeWithtail() {
		Node temp1=head;
		Node temp2=tail;
		
//		while(tem) {
//			
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeDoublyLinkedList list = new PalindromeDoublyLinkedList();

		char[] a = { 'r', 'a', 'd', 'a', 'r' };
		for (char i : a) {
			list.push(i);
		}

		list.checkPalindromeWithtail();
		list.printList();

	}

}
