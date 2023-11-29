package com.customize.linkedlist;

import java.util.LinkedList;

// Java program to swap two given nodes of a linked list

	class NodeOne {
		int data;
		NodeOne next;
		NodeOne(int d)
		{
			data = d;
			next = null;
		}
	}

	class LinkedListSwap {
		NodeOne head; 

		/* Function to swap Nodes x and y in linked list by
		changing links */
		public void swapNodes(int x, int y)
		{
			// Nothing to do if x and y are same
			if (x == y)
				return;

			// Search for x (keep track of prevX and CurrX)
			NodeOne prevX = null, currX = head;
			while (currX != null && currX.data != x) {
				prevX = currX;
				currX = currX.next;
			}

			// Search for y (keep track of prevY and currY)
			NodeOne prevY = null, currY = head;
			while (currY != null && currY.data != y) {
				prevY = currY;
				currY = currY.next;
			}

			// If either x or y is not present, nothing to do
			if (currX == null || currY == null)
				return;

			// If x is not head of linked list
			if (prevX != null)
				prevX.next = currY;
			else // make y the new head
				head = currY;

			// If y is not head of linked list
			if (prevY != null)
				prevY.next = currX;
			else // make x the new head
				head = currX;

			// Swap next pointers
			NodeOne temp = currX.next;
			currX.next = currY.next;
			currY.next = temp;
		}

		/* Function to add Node at beginning of list. */
		public void push(int new_data)
		{
			/* 1. alloc the Node and put the data */
			NodeOne new_Node = new NodeOne(new_data);

			/* 2. Make next of new Node as head */
			new_Node.next = head;

			/* 3. Move the head to point to new Node */
			head = new_Node;
		}

		/* This function prints contents of linked list starting
		from the given Node */
		public void printList()
		{
			NodeOne tNode = head;
			while (tNode != null) {
				System.out.print(tNode.data + " ");
				tNode = tNode.next;
			}
		}

		/* Driver program to test above function */
		public static void main(String[] args)
		{
			LinkedListSwap llist = new LinkedListSwap();

			/* The constructed linked list is:
				1->2->3->4->5->6->7 */
			llist.push(7);
			llist.push(6);
			llist.push(5);
			llist.push(4);
			llist.push(3);
			llist.push(2);
			llist.push(1);

			System.out.print(
				"\n Linked list before calling swapNodes() ");
			llist.printList();

			llist.swapNodes(4, 3);

			System.out.print(
				"\n Linked list after calling swapNodes() ");
			llist.printList();
		}
		
		//using predefine method
		public static void swap(LinkedList<Integer> list,
                int ele1, int ele2)
{

// Getting the positions of the elements
int index1 = list.indexOf(ele1);
int index2 = list.indexOf(ele2);

// Returning if the element is not present in the
// LinkedList
if (index1 == -1 || index2 == -1) {
return;
}

// Swapping the elements
list.set(index1, ele2);
list.set(index2, ele1);
}
	}


