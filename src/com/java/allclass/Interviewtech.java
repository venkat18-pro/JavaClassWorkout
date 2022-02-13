package com.java.allclass;

import java.util.Arrays;

public class Interviewtech {
	String name;
	boolean bo;
	float fl;
	char ch;
	int [] array[];
	void method(String name) {
		this.name = "venkat";
		System.out.println(name);
	}

	void addNumber(int n) {
		for(int i=0; i<=(n/2); i++) {
			for(int j=0; j<=n; j++) {
				if((i+j) == n) {
				System.out.println(i +" + "+j+"="+(i+j));
				System.out.println(j +" + "+i+"="+(i+j));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		
		System.out.println(a);
		boolean b = a==0? true: false;
		
		System.out.println(b);
		
		double d = 2.4;
		
		int[] arr = {-20,-34,1,4};
		
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length;++i) System.out.println(arr[i]);
		Interviewtech in = new Interviewtech();
		in.method("vicky");
		System.out.println(in.array);
		
		char c1 = 064770;
		char c2 = 0xbeef;
		
		Interviewtech inTech = new Interviewtech();
		inTech.addNumber(31);
		
		
	}

}
