package com.string.classprograms;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		
		String str="Hi Mahesh How are You ";
		
		System.out.println(str.toLowerCase());
		int i, vowel=0, consonant=0;
		
		for(i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
 			if(ch!=' ') 
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowel++;
				}
				else 
					consonant++;
				}
			}

		
        System.out.println("\nThe total Vowels are : "+vowel+" and total consonant are : "+consonant);
		}
	}


