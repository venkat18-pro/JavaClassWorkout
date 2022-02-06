package com.java.allclass;
import java.util.regex.*;

public class PatternClass {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b*cc");
		Matcher m = p.matcher("aaaaabbbcc");
		System.out.println("Boolean : " + m.matches());
	}

}
