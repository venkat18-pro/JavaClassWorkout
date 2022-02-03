package com.java.allclass;

public class MultiThread {

	public void add() {
		int a =10,b=20,c;
		c=a+b;
		System.out.println("Add"+c);
	}
	
	public void sub() {
		int a =30,b=20,c;
		c=a-b;
		System.out.println("Sub"+c);
	}
	public static void main(String[] args) throws Throwable {
		
		MultiThread mt = new MultiThread();
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1.");
				mt.add();
			}
		});
		
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2.");
				mt.sub();
			}	
		});
		
		
		th.start();
		System.out.println("Thread ID: "+th.getId());
		th1.start();
		System.out.println("Thread 1 ID: "+th1.getId());
		System.out.println("Hello");
	}

}
