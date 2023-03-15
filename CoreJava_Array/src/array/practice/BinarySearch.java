package array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();    //int arr[]= {10,48,12,45,63,96,72};
		}                                       // 0 1  2   3  4  5  6
		Arrays.sort(arr);
		System.out.println("\nThe Sorted Array: "+Arrays.toString(arr));
		System.out.println("\nEnter the element that you want to search: ");
		int search =sc.nextInt();
		
		int lower_index=0;
		int higher_index=arr.length-1;
		int mid_index=(lower_index+higher_index)/2;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[mid_index]==search)
			{
				count++;
			}
			else if(arr[mid_index]<search)
			{
				lower_index=mid_index+1;
			}
			else
			{
				higher_index=mid_index-1;
			}
			mid_index=(lower_index+higher_index)/2;
		}
		
		if(count!=0)
		{
			System.out.println("\nElement found at "+mid_index+" index position");
		}
		else
		{
			System.out.println("\nElement not found");
		}
		

	}

}
