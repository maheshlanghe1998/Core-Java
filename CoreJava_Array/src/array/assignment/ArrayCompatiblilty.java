package array.assignment;

import java.util.Scanner;

public class ArrayCompatiblilty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for First array: ");
		int size1 = sc.nextInt();
		if(size1<=0)
		{
			System.out.println("Invalid array size");
		}
		else
		{
		int i,j, count=0;
		int arr1[]=new int [size1];
		System.out.println("Enter the elements for First array: ");
		for(i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size for Second array: ");
		int size2 = sc.nextInt();
		
		int arr2[]=new int [size2];
		System.out.println("Enter the elements for Second array: ");
		for(j=0;j<size2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		for(i=0;i<size1;i++)
		{
			for(j=0;j<size2;j++)
			{
				if((arr1[i]>=arr2[j]) && (size1==size2))
				{
					count++;	
				}
				
			}
		}
		
		if(count!=0)
		{
			System.out.println("Arrays are Compatible");
		}
		else
		{
			System.out.println("Arrays are Not Compatible");
		}
			
		}
	}

  }

