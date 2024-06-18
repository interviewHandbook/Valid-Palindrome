package com.interviewPrep.leetcode.easy.validpalindrome;

public class FirstApproach {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";
		//String s = " ";
		
		FirstApproach fa = new FirstApproach();
		boolean isPalin =  fa.isPalindrome(s);
		
		System.out.println(isPalin);
		
	}
	
	
	
	public boolean isPalindrome(String s) {
		
		boolean isPalin = true;
		
		// remove all non-alphanumeric characters
		s = s.replaceAll("[^A-Za-z0-9]", "");
		
		// remove spaces
		s = s.replace(" ", "");
		
		// convert string to lower case
		s = s.toLowerCase();
		
		// if the length of string here is zero then return true 
		if(s.length() == 0) {
			
			return isPalin;
		}
		
		// get the mid-point of the string length 
		int index = s.length() / 2;
		
		// compare the respective characters from both ends of the string till mid-point
		for(int i=0; i<=index; i++) {
			
			if( s.charAt(i) != s.charAt(s.length()-1-i)) {
				
				isPalin = false;
				break;
			}
		}
		
		return isPalin;
        
    }

}
