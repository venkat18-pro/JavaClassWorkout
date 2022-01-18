package com.java.allclass;

import java.util.*;

class Comp implements Comparator<Integer>{
	
	@Override
	public int compare(Integer a,Integer b) {
		
		if(a%10 > b%10) {
			return 1;
		}else {
			return -1;
		}
		
	
	}
	
}

public class ComparatorClass {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(39);
		l.add(28);
		l.add(85);
		l.add(24);
		l.add(27);
		
		Comp c = new Comp();
		Collections.sort(l, c);
		
		System.out.println(l);
		
	}
	
	
	
}
