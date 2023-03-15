package com.string.classprograms;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String input ="Hi Mahesh Good Morning";
		System.out.println("orignal String is:  "+input);
		String output="";
		String words[]=input.split(" ");
		
		for(String word:words)
		{
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse = reverse+word.charAt(i);
			}
			
			output = output+reverse+" ";
		}
		System.out.println(output);

	}

}
