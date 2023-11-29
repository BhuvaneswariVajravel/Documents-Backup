package com.customize.linkedlist;

 /* Java program to check if linked list is palindrome recursively */
import java.util.*;

public class LinkedListPalidrome {
	public static void main(String args[])
	{
		Node one = new Node('a');
		Node two = new Node('b');
		Node three = new Node('c');
		Node four = new Node('d');
		Node five = new Node('c');
		Node six = new Node('b');
		Node seven = new Node('a');
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}
	public static boolean isPalindrome(Node head)
	{

		Node slow = head;
		boolean ispalin = true;
		Stack<Character> stack = new Stack<>();

		while (slow != null) {
			stack.push(slow.data);
			 slow = slow.next; 
		}
		System.out.println("stack :" + stack);
		while (head != null) {

			char i = stack.pop();
			 if (head.data == i) {
				ispalin = true;
			}
			else {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		return ispalin;
	}
}

class Node {
	char data;
	Node next;
	Node(char d)
	{
		next = null;
		data = d;
	}
}

