package com.java.allclass;

public class MultiThread {

	static Thread th1;
	static Thread th2;
	static Thread th3;
	
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
	
	
	public synchronized void syn(int num) throws Throwable  {
		for(int i=1; i<=10;i++) {
			System.out.println(i + " * "+ num + " = "+ i*num);
			Thread.sleep(1000);
		}
	}

	public static void threadName() {
		
		th1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Venkat 1");
			}
		}); 
		th2 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Vicky 2");
			}
		});
		th3 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Vj 3");
			}
		});
		th1.setName("Venkat");
		th1.setPriority(10);
		th2.setName("Vicky");
		th2.setPriority(10);
		th3.setName("Vj");
		th3.setPriority(10);
		System.out.println(th1.getName() + "  "+th1.getPriority());
		System.out.println(th2.getName()+"  "+th2.getPriority());
		System.out.println(th3.getName()+"  "+th3.getPriority());
		
		th1.start();
		th3.start();
		th2.start();
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		MultiThread mt = new MultiThread();
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1.");
				try {
					mt.syn(10);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2.");
				try {
					mt.syn(2);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		});
		
//		th.start();
//		System.out.println("Thread ID: "+th.getId());
//		System.out.println("Thread Name: "+th.getName());
//		th1.start();
//		System.out.println("Thread 1 ID: "+th1.getId());
//		System.out.println("Thread 1 Name: "+th1.getName());
//		System.out.println("Hello");
		
		
		threadName();
		
		MultiThread mul = new MultiThread();
		
		MultiThread mul1 = mul;
		
		System.out.println(mul.hashCode());
		System.out.println(mul1.hashCode());
		
		System.gc();
		System.out.println("End of the garbage collection.");
		
	}
	@Override
	public void finalize() {
		System.out.println("finalize method is calling..");
	}
	
}
