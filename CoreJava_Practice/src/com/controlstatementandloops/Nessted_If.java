package com.controlstatementandloops;

public class Nessted_If {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int c=20;
		int largest;
		if(a>=b)
		{
			if(a>=c)
			{
				largest=a;
			}
			else 
			{
				largest=c;
				
			}
		}
		else 
		{
			if(b>=c)
			{
				largest =b;
			}
			else 
			{
				largest=c;
				
			}
		}
		
		System.out.println("The largest Value is : "+largest);
	}

}
