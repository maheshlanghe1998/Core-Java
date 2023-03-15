package array.assignment;

import java.util.Scanner;

public class HighestMarksSem 
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of semester: ");
		int sem =sc.nextInt();
		int i,j,HighestMark;
		int subject[]= new int [sem];
		
		for( i=0;i<subject.length;i++)
		{
			System.out.println("Enter no of subjects in "+ (i+1)+" semester: ");
			subject[i]=sc.nextInt();
		}
		for(i=0;i<subject.length;i++)
		{
			int marks[]=new int [subject[i]];
			
            System.out.println("Marks obtained in semester "+(i+1)+": ");
			for(j=0;j<marks.length;j++)
			{
				marks[j]=sc.nextInt();
			}
			
			 HighestMark =marks[0];
			
			 for( j=1;j<marks.length;j++)
			{  
				 
			  if(marks[j]>HighestMark)
			   {
				 HighestMark=marks[j];
			   }
			
			}
			
		  System.out.println("Highest Marks in "+(i+1)+ " sem: "+HighestMark);
		}
			  
		}
			
	}