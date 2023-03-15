package array.assignment;

import java.util.Scanner;

public class PassFailCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of subjects:");
		int subject = sc.nextInt();

		if(subject<=0 || subject>20)
		{
			System.out.println("Invalid input range");
		}
		else {
			int arr[]=new int [subject];
			int count1=0, count2=0;
			
			System.out.println("Enter the marks: ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();   
				
					if(arr[i]>50)
					{
						count1++;
					}
					else
					{
						count2++;
					}
			 }
			if(count1==subject)
			{
				System.out.println("Ram passed in all subjects");
			}
			else if(count2==subject)
			{
				System.out.println("Ram failed in all subjects");
			}
			else
			{
			    System.out.println("Ram passed in "+count1+" subjects and failed in "+count2+" subjects");
			}
		}
		
	   }
				
	}


