package com.string.classprograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "hello programmer good morning";
		System.out.println("Original String: "+str);
		
		String str1="";
		String str2[]=str.split(" ");
		
		for(String word:str2)
		{
			String rev="";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev=rev+word.charAt(i);
			}
			str1=str1+rev+" ";
			
		}
		System.out.println("Reverse String: " +str1);
		
	}

}
