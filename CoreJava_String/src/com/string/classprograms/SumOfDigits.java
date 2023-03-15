package com.string.classprograms;

public class SumOfDigits {
	
	
	static void sumOfDigitsInGivenString()
	{
		String str = "12dfs345234dfc";
		int sum =0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum = sum+Integer.parseInt(str.charAt(i)+"");
				
			}
		}
		System.out.println("sum of digits in given String "+sum);
	}

	public static void main(String[] args) {

		sumOfDigitsInGivenString();
	}

}
