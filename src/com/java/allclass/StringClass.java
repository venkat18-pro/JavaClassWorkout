package com.java.allclass;

public class StringClass {

	public static void main(String[] args) throws Exception {	
		System.out.println(String.valueOf(true));
		
		String s = "Ahello hello";
		
		System.out.println(s.replaceFirst("hello", "Hi"));
		byte[] b = s.getBytes();
		System.out.println(b[0]);
		char[] c = {'a', 'd', 'f'};
		System.out.println(String.copyValueOf(c, 0, 2));
	}

}
