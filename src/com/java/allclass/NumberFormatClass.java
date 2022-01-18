package com.java.allclass;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass{

	public static void main(String[] args) throws Throwable {
		
		PrintStream out = System.out;
		double d = 64743367.66;
		String s = "53849";
		NumberFormat ins = NumberFormat.getInstance();
		NumberFormat in = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat integer = NumberFormat.getIntegerInstance();
		
		integer.setMaximumIntegerDigits(11);
		out.println("Get the maximum integer digits: "+integer.getMaximumIntegerDigits());
		
		out.println("Double to Intger: "+integer.format(d));
		out.println("US Currency format: "+in.format(d));
		
		Number parse = ins.parse(s);
		
		System.out.println("String to int by using NumberFormat: " + parse.intValue());
		System.out.println("String to Integer useing Integer class: "+Integer.parseInt(s));
	}
	
	
}
