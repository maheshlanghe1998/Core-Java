package basics;

import java.util.Scanner;

public class CountChar 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
       
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the Word:");
		String s =sc.next();
		int count=0;
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='H')
				count++;
		}
		System.out.println(count);
	}

}
