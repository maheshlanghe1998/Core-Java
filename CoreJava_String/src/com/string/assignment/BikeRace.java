package com.string.assignment;

import java.util.Scanner;

public class BikeRace {

	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        String distance = sc.next();
        int num = Integer.parseInt(distance);
        
        if(num>0)
        {   
        	//char [] array=distance.toCharArray();
            String[] array = distance.split("");
            int[] arr = new int[distance.length()];
            
            //int num1=0,num2=0;
            int num1=1,num2=1;
            
            for(int i=0;i<distance.length();i++)
            {
               arr[i] = Integer.parseInt(array[i]); 
            }
        
            for(int i = 0; i<distance.length();i++)
            {
                if(i%2==0)
                {
                    num1 = num1*arr[i];
                }
                else
                {
                	num2 = num2*arr[i];
                }
            }
        
            if(num1<num2)
            {
                System.out.println("Your bonus points is "+num2);
            }
            else if(num1>num2)
            {
                System.out.println("Your bonus points is " +num1);
            }
            else if(num1==num2)
            {
                System.out.println("Your bonus points is "+(num1*2));
            }
        }
        else if(num==0)
        {
            System.out.println("Your bonus points is 0");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

}
