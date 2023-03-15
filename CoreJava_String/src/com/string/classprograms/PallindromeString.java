package com.string.classprograms;

public class PallindromeString {

	static void StringReverse()
	{
		String str ="mam";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println("not palindrome String");
		}
		
	}
	
	public static void main(String[] args) {
		
            StringReverse();
            
	}

}
