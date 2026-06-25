package com.javacoding;

public class Boolean {
	public static void main(String[]args) {
 //boolean sravas = true ;
// System.out.println(true);
	boolean parlindrome = true ;
	String s = "bbccba";
	int n = s.length();
	for(int i=0;i<n/2;i++) {
		System.out.println(i);
		if(s.charAt(i)!= s.charAt(n-i-1)) {
			parlindrome = false ;
			break ;
			
		}
		}
		if(parlindrome) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
		
	}
	}
