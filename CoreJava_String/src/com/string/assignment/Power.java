package com.string.assignment;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the digit");
        int digit =sc.nextInt();
        int res=1;
        if(num>=0)
        {
        	for(int i=1;i<=digit;i++)
            {
            	res*=num;
            }
            
            System.out.println(res);

        }
        else
        {
        	System.out.println("Invalid Input");
        }
	}

}
