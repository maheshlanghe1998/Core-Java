package assignment.day9;

import java.util.Scanner;

public class Alpha {
	
	public static boolean isAlpha(char ch) 
	{
		  if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
		  {
			  return true;  
	  	  }
		  return false;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Character [between A-Z or a-z]: ");
		char ch=sc.next().charAt(0);
		
		System.out.println(Alpha.isAlpha(ch));
		
	}

}
