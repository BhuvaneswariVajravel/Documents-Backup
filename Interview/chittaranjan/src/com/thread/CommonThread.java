package com.thread;

public class CommonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerProducer cp = new ConsumerProducer();
		
		Thread t1	= new Thread(()->{
			try {
			
				cp.produce();
			}
			catch(InterruptedException ex) {
			}
			});
		Thread t2 = new Thread(()->{
				try {
					cp.consume();
				}catch(InterruptedException ex) {
					
				}
			});
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();	
		}catch(InterruptedException ex) {
			
		}
		
	}

}
