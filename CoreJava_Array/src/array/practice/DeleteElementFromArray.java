package array.practice;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the array size: "); //5
				int size= sc.nextInt();
				
				int arr[]=new int[size];
				
				System.out.println("Enter all the elements: "); //10 20 30 40 50 
				for(int i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();	
				}
		        System.out.println("Enter the position to Delete: "); //3
		        int pos =sc.nextInt();
		      
		        for(int i=pos;i<=(size-1);i++)   //i=3;i<=4;i++
		        {
		        	arr[i-1]=arr[i];             //arr[3-1]....arr[2]=arr[pos]...arr[3]
		        }
		        
		        System.out.println("Array After deleting an element element: "); //10 20 40 50 
		        for(int i=0;i<arr.length-1;i++)
		        {
		        	System.out.print(arr[i]+" ");
		        }

			}

	}


