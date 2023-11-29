package com.cache;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Iterator;


public class LRCacheTest {
	Set<Integer> cache;
	int capacity ;
	public LRCacheTest(int capacity) {
	cache = new LinkedHashSet<>(capacity);	
	this.capacity=capacity;
	}
	public void put(int key) {
	if(cache.size()== capacity)	{
		int firstKey = cache.iterator().next();
		cache.remove(firstKey);
	}
	cache.add(key);
	}
	public boolean getKey(int key) {
		if(cache.contains(key)) {
			cache.remove(key);
			cache.add(key);
			return true ;
		}
		return false;
	}
	public void display()
	{
	LinkedList<Integer> list = new LinkedList<>(cache);
	
	Iterator<Integer> itr = list.descendingIterator();
		
	while (itr.hasNext())
			System.out.print(itr.next() + " ");
	}
	
	
	
	public static void main(String[] args)
	{
		LRCacheTest ca = new LRCacheTest(4);
		ca.put(1);
		ca.put(2);
		ca.put(3);
		ca.put(1);
		ca.put(4); 
		ca.put(5);
		ca.getKey(2);
		ca.put(6);
		ca.display();//4526--6 2 5 4
	}

}
