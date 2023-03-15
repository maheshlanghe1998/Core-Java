package array.assignment;

import java.util.Scanner;

public class SearchCourseArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int i,size;	int count=0;
		System.out.println("Enter no of course: ");
		size=sc.nextInt();
		if(size<=0 || size>20)
		{
			System.out.println("Invalid range");
		}
		else
		{
			String arr[]=new String[size];
		    System.out.println("Enter the course name: ");	
			for(i=0;i<size;i++)
			{
			    arr[i]=sc.next();
			}
			
			System.out.println("Enter the course to be searched:");
			String course =sc.next();
			
			for(i=0;i<size;i++)
			{
				if(course.equals(arr[i]))
				{   
					count++;
				}
				
			}	
			
			if(count==0)
			{
					System.out.println(course+" course is not available");
				
			}
			else
			{
				System.out.println(course+" course is  available");
			}
		}

	}

}
