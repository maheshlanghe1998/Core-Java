package array.assignment;

import java.util.Scanner;

public class DuplicateAnElement {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size =sc.nextInt();
		 if(size<=0)
		 {
			 System.out.println("Invalid array size");
		 }
		 else
		 {

			 int temp = 0;
			 int arr[]=new int [size];
			 int arr1[]=new int [size+1];
			 System.out.println("Enter the elements: ");
			 for(int i=0;i<size;i++)
			 {
				 arr[i]=sc.nextInt();
			 }
			 
			 System.out.println("Enter the position of the element to be replicated:");
			 int x =sc.nextInt();
			 
			 if(x>arr.length)
			 {
				System.out.println("Position is greater than the size of an array"); 
			 }
			 else
			 {
				 for(int i=0;i<size;i++)
				 {
					 if(x==i)
					 {
						 temp=arr[i];
					 }
				 }
				 for(int i=0;i<arr.length;i++)
				 {
					 arr1[i]=arr[i];	 
				 }
				
				 for(int i=0;i<arr1.length;i++)
				 {
				     arr1[arr1.length-1]=temp;
				 }
				 for(int i=0;i<arr1.length;i++)
				 {
					 System.out.print(arr1[i]+" ");
				 }
			 }
			 
		 }
		 
	}

}
