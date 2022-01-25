package com.java.allclass;



public class EnumClass {

	public enum Days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
	
	public static void main(String[] args) {
		
		for(Days day: Days.values()) {
			System.out.println(day);
		}
	}
	
}
