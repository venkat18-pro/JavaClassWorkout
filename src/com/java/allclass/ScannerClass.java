package com.java.allclass;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] split = line.split(" ");
		for(String str : split) {
			String trim = str.trim();
			System.out.println(trim);
			if(!(trim.isEmpty())) {
				int value = Integer.parseInt(trim);
				list.add(value);
			}
			
		}
		System.out.println(list);
	}

}
