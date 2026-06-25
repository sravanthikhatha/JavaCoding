package com.javacoding;

public class Palindrome {

	public static void main(String[] args) {
		// reversing a String 
		String s = "sravas";
		String ans = "";
		
		for(int i=5; i>=0;i--) {
			ans = ans + s.charAt(i);
		}
			//System.out.println(s.charAt(i));
			System.out.println(ans);
			
			
		}

	}


