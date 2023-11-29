package com.cache;

import java.util.HashMap;

public class LRUCache {
	
	class Node {

		 int key;
		 int value;
		 Node pre;
		 Node next;
		 Node(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
	}
	
	private HashMap<Integer,Node> map;
	private int capacity, count;
	private Node head, tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<Integer, Node>();
		this.head = new Node(0, 0);
		this.tail = new Node(0,0);
		head.next = tail;
		tail.pre = head;
		head.pre = null;
		tail.next = null;
	}

	public int get(int key) {
		if(map.get(key)!=null) {
			Node node = map.get(key);
			int value = node.value;
			deleteNode(node);
			addToHead(node);
			return value;
		}
		return -1;
	}
	
	public void put(int key, int value) {
		if(map.get(key)!=null) {
			Node node = map.get(key);
			node.value = value;
			deleteNode(node);
			addToHead(node);
		}else {
			Node node = new Node(key, value);
			map.put(key, node);
			if(count<capacity) {
				count++;
				addToHead(node);
			}else {
				map.remove(tail.pre.key);
				deleteNode(tail.pre);
				addToHead(node);
			}
		}
	}

	private void deleteNode(Node node) {
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}

	private void addToHead(Node node) {
		node.next = head.next;
		node.next.pre = node;
		node.pre=head;
		head.next= node;
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		cache.put(4, 40);
		System.out.println("value of key is "+cache.get(3));
		//cache.put(3, 30);
		//System.out.println("value of key is "+cache.get(2));
	}
	
	
}
