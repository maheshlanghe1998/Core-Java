package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) throws IOException 
	{ 
		  InputStreamReader i = new InputStreamReader(System.in);
	        BufferedReader bf = new BufferedReader(i);
	        String[] arr = bf.readLine().split(" ");
	        float x = Float.parseFloat(arr[0]);
	        float y = Float.parseFloat(arr[1]);
	        
	        if(x%5==0 && y>=(x+0.5))
		{
		   System.out.println(y-x-0.5);	
		}
		else
		{
			System.out.println(y);
		}
   
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of cash which Pooja wishes to withdraw: ");
		float x=sc.nextFloat();
		System.out.println("Pooja's initial account balance: ");
		float y = sc.nextFloat();
		
		if(x%5==0 && y>=(x+0.5))
		{
		   System.out.println(y-x-0.5);	
		}
		else
		{
			System.out.println(y);
		}
		*/
	}

}
