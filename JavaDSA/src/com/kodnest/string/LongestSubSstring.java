package com.kodnest.string;

public class LongestSubSstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		int result = lengthOfSubstring(str);
		for(int i=0; i<str.length(); i++) {
			System.out.println("The length of Substring is " + result);
		}
		
	}
	public static int lengthOfSubstring(String str) {
		int maxLength =0;
		for(int i=0; i<str.length(); i++) {
			String r ="";
			for(int j=i; j<str.length(); j++) {
				char c = str.charAt(j);
				if(r.indexOf(c) !=-1) {
					break;
				
				}
				r += c;
				if(r.length() > maxLength)
					maxLength = r.length();
				
			}
			
		}
		return maxLength;
	}
}
