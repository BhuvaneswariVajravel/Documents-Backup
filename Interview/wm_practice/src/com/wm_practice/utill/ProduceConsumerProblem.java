package com.wm_practice.utill;

/*
 * 
 * Problem:
 * To make sure that the producer won’t try to add 
 * data into the buffer if it’s full and that the consumer 
 * won’t try to remove data from an empty buffer.
 * 
 */

import java.lang.Thread;

// Producer class which extends the
// thread
class Producer extends Thread {

	// Creating a string buffer
	StringBuffer buffer;
	boolean dp = false;

	// Initializing the string buffer
	Producer()
	{
		buffer = new StringBuffer(4);
	}
	public void run()
    {
        for (int i = 0; i < 4; i++) {
            try {
                buffer.append(i);
                System.out.println("Produced " + i);
            }
            catch (Exception e) {
 
                e.printStackTrace();
            }
        }
        System.out.println("Buffer is FUll");
 
        Consumer c = new Consumer(this);
    
    }
}


class Consumer extends Thread {
 Producer p;
 Thread t2;

 Consumer(Producer temp)
 {
     p = temp;

     t2 = new Thread(this);
     t2.start();
 }

 public void run()
 {
     try {
         for (int i = 0; i < 4; i++) {
             System.out.print(p.buffer.charAt(i) + " ");
         }
     }
     catch (Exception e) {
         e.printStackTrace();
     }
     System.out.println("\nBuffer is Empty");

 }
 
	
}



class ProduceConsumerProblem {
	public static void main(String args[])
	{		
		Producer p = new Producer();

		Thread t1 = new Thread(p);

		t1.start();
	}
}
