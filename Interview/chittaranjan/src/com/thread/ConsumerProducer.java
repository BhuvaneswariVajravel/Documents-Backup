package com.thread;

import java.util.LinkedList;
import java.util.Random;

public class ConsumerProducer {
	LinkedList<Integer> list = new LinkedList<>();
	private static  final int CAPACITY= 10 ;
	private  int value = 1;

	public void produce() throws InterruptedException {
		 while(true && value<=10 ) {
			synchronized(this) {
				if(list.size()==CAPACITY) {
					System.out.println("bucket is full waiting to consume::");
					wait();
				}
				
				   list.add(value);
				   System.out.println("producer produce::"+value);
				   value++;
				    notify();
			}
			
		}
	}
	public void consume() throws InterruptedException{
		 Random time = new Random();
		while(true) {
			synchronized(this) {
				if(list.isEmpty()) {
					System.out.println("bucket is empty wiating to produce::");
					wait();
				}
				int value = list.removeFirst();
				System.out.println("consumer consume::"+value);
				notify();
				Thread.sleep(time.nextInt(1000));
			}
		}
	}
}
