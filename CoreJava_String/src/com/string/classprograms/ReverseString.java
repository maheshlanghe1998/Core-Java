package com.string.classprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "mahesh";
	    System.out.println("String Before Reverse: "+str1);
		String rev = "";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println("String After Reverse: "+rev);
		
	}

	

}
