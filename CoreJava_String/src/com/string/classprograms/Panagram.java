package com.string.classprograms;

public class Panagram {

	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
	}

	public  static boolean isPanagram(String str) {
		
		if(str.length()<26)
		{
			return false;
			
		}
		else
		{
			for(char ch='a';ch<='z';ch++)
			{
				if(str.indexOf(ch)<0)
				{
				return false;
				}
			}
		}
		return true;
	}

}
