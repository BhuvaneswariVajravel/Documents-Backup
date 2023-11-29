package com.customize.hashmap;

import com.customize.hashmap.*;

public class CusHashMap<K, V> {
	
	private int initialCapacity =16;
	private Node<K,V>[] bucket =null;
	
	@SuppressWarnings("unchecked")
	public CusHashMap() {
		bucket = new Node[initialCapacity];
	}
	
	@SuppressWarnings("unchecked")
	public CusHashMap(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		bucket = new Node[initialCapacity];
	}
	
	public void put(K key, V value) {
		//get the index by calculating hashcode
		int index = calcIndex(key);
		
		//create a new node to insert
		Node<K,V> newNode = new Node<K, V>(key, value, null);
		
		//if bucket of index is null then insert the new node to that bucket
		if(bucket[index]==null) {
			bucket[index] = newNode;
		}else {
			//traverse to the end of the node and add new node
			Node<K,V> prevNode = null;
			Node<K,V> currNode  = bucket[index];
			while (currNode!=null) {
				// if existing key matches just update the value
				if(currNode.getKey().equals(key)) {
					currNode.setValue(value);
					break;
				}
				prevNode = currNode;
				currNode = currNode.getNext();
			}
			if(prevNode!=null) {
				prevNode.setNext(newNode);
			}
		}
	}
	
	private V get(K key) {
		//calculate the index using hashcode
		int index = calcIndex(key);

		V value = null;
		
		//based on the keyindex get the first node of the bucket
		//and traverse to the nodes till we get the exact key
		Node<K,V> currNode = bucket[index];
		while(null!=currNode) {
			if(currNode.getKey().equals(key)) {
				value = currNode.getValue();
				break;
			}
			currNode = currNode.getNext();
		}
		return value;
	}
	
	public void remove(K key) {
		int index = calcIndex(key);
		
		Node<K,V> currNode = bucket[index];
		Node<K,V> prevNode = null;
		
		while(null!=currNode) {
			if(currNode.getKey().equals(key)) {
				if(null==prevNode) {
					currNode = currNode.getNext();
					bucket[index]=currNode;
					return;
				}else {
					prevNode.setNext(currNode.getNext());
					return;
				}
			}
			prevNode = currNode;
			currNode = prevNode.getNext();
		}
		
	}
	private int calcIndex(K key) {
		if(null==key) {
			return 0;
		}else {
			return Math.abs(key.hashCode()%(initialCapacity));
		}
		
	}
	
	public void display() {
		for(int i=0;i<initialCapacity;i++) {
			
			if (null!=bucket[i]) {
				Node<K,V> curNode = bucket[i];
				while(curNode!=null) {
					System.out.println(String.format("Key is %s and value is %s", curNode.getKey(),curNode.getValue()));
					curNode = curNode.getNext();
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		CusHashMap<Integer, String> chp = new CusHashMap<Integer, String>();
		chp.put(1, "One");
		chp.put(null, "zero");
		chp.put(2, "Two");
		chp.display();
		System.out.println("***********************");
		System.out.println(chp.get(1));
		System.out.println("***********************");
		chp.remove(1);
		chp.display();
	}
	
	

}
