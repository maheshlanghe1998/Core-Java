package com.string.classprograms;

public class CharReplace {

	static int count=1;

	public static void main(String[] args) {
		
		String input ="opentextextextext";
		char charToReplace = 't';
		
		if(input.indexOf(charToReplace)==-1)
		{
			System.out.println("Given character is not avalible in the string");
		}
        for(int i=0;i<input.length();i++)
        {
        	char ch  =input.charAt(i);
        	
        	if(ch==charToReplace)
        	{
        		
				input =input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
        	}
        }
        System.out.println(input);
	}

}
