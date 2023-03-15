package assignment.day5;

import java.util.Scanner;

public class CountPositiveNegativeZero {
    //Count positive ,negative and zero using do-while loop.
	public static void main(String[] args) {
		char ch;
		int  count=0,count1=0,count2=0;
		do
		{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int num=sc.nextInt();
		
		
			if(num>0)
			{
				System.out.println("Positve number");
				count++;
			}
			else if(num<0)
			{
				System.out.println("Negative Number");
				count1++;
			}
			else
			{
				System.out.println("Zero Number");
				count2++;
			}
			
			System.out.println("Do you want to continue? yes or no");
			 ch=sc.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
		
		System.out.println("\ncount of positive number: "+count+"\ncount of negative number: "+count1+"\ncount of zero number: "+count2);
		
         }

}
