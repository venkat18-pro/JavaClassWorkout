package com.java.allclass;

import java.math.BigDecimal;

public class BigDecimalClass {

	public static void main(String[] args) {
	
		BigDecimal d1 = new BigDecimal("34.678");
		BigDecimal d2 = new BigDecimal("32.483");
		
		System.out.println("d1 - d2 = "+d1.subtract(d2));
		
		double d3 = 34.678;
		double d4 = 32.483;
		double d5 = d3-d4;
		System.out.println("d3 - d4 = "+(d3-d4));
	}

}
