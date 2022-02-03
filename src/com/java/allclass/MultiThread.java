package com.java.allclass;

public class MultiThread {

	static {
		System.out.println("Hello i am from Static..");
	}
	
	static {
		System.out.println("Hi.");
	}
	public void add() {
		int a =10,b=20,c;
		c=a+b;
		System.out.println("Add: "+c);
	}
	
	public void sub() {
		int a =30,b=20,c;
		c=a-b;
		System.out.println("Sub: "+c);
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
		System.out.println("Thread Name: "+th.getName());
		th1.start();
		System.out.println("Thread 1 ID: "+th1.getId());
		System.out.println("Thread 1 Name: "+th1.getName());
		System.out.println("Hello");
	}
static {
	for(int i=0;i<=5;i++)
	System.out.println("How are you");
}
}
