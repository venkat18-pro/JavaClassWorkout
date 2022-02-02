package com.java.allclass;

interface Inter{
	void hello();
}

public class Anonymous {

	public static void main(String[] args) {
		Inter in = new Inter() {
			@Override
			public void hello() {
				System.out.println("Hello World.");
			}
		};
		
		in.hello();
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Child Thread..");
			}
		});
		
		th.start();
		
		System.out.println("Main Thread.");
	}

}
