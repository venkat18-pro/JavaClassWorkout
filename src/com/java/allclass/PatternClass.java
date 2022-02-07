package com.java.allclass;
import java.util.regex.*;

public class PatternClass {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b*cc");
		Matcher m = p.matcher("aaaaabbbcc");
		System.out.println("Boolean : " + m.matches());
		
		System.out.println("Another way : " + Pattern.matches("ab", "ab"));
		
		Pattern p1 = Pattern.compile("venkat");
		
		Matcher m1 = p1.matcher("venkatforvenkat");
		
		while(m1.find()) {
			
			System.out.println("Pattern found from "+m1.start()+" to "+(m1.end()-1));
			
		}
		
		Pattern p2 = Pattern.compile("[a-i&&[aeiou]]");
		Matcher m2 = p2.matcher("e");
		System.out.println(m2.matches());
		
	}

}
