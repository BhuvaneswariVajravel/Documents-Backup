package com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample implements Runnable{

private String name;
//Maximum number of threads in thread pool
		static final int MAX_T = 3;	
	public ExecutorServiceExample(String s)
	{
		name = s;
	}
	
	// Prints task name and sleeps for 1s
	// This Whole process is repeated 5 times
	public void run()
	{
		try
		{
			for (int i = 0; i<=5; i++)
			{
				if (i==0)
				{
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for"
							+ " task name - "+ name +" = " +ft.format(d));
					//prints the initialization time for every task
				}
				else
				{
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name - "+
							name +" = " +ft.format(d));
					// prints the execution time for every task
				}
				Thread.sleep(1000);
			}
			System.out.println(name+" complete");
		}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

			

		public static void main(String[] args)
		{
			// creates five ExecutorServiceExamples
			Runnable r1 = new ExecutorServiceExample("ExecutorServiceExample 1");
			Runnable r2 = new ExecutorServiceExample("ExecutorServiceExample 2");
			Runnable r3 = new ExecutorServiceExample("ExecutorServiceExample 3");
			Runnable r4 = new ExecutorServiceExample("ExecutorServiceExample 4");
			Runnable r5 = new ExecutorServiceExample("ExecutorServiceExample 5");	
			
			// creates a thread pool with MAX_T no. of
			// threads as the fixed pool size(Step 2)
			ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
			
			// passes the ExecutorServiceExample objects to the pool to execute (Step 3)
			pool.execute(r1);
			pool.execute(r2);
			pool.execute(r3);
			pool.execute(r4);
			pool.execute(r5);
			
			// pool shutdown ( Step 4)
			pool.shutdown();	
		}
}
