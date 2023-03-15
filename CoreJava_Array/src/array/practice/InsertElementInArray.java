package array.practice;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");  //5
		int size= sc.nextInt();
		
		int arr[]=new int[size+1];
		
		System.out.println("Enter all the elements: ");
		for(int i=0;i<size;i++)
		{                            
			arr[i]=sc.nextInt();	//10 20  30  40  50 
		}                           //0   1  2   3   4   
        System.out.println("Enter the position: ");
        int pos =sc.nextInt();  //3
        
        System.out.println("Enter the element that you want to insert in array: ");//60
        int num =sc.nextInt();
                    //4    4>=2     
        for(int i=(size-1);i>=(pos-1);i--)
        {
        	arr[i+1]=arr[i];      //10 20  60  30 40 50 
        }                         //0   1  2  3  4  5
        
        arr[pos-1]=num;
        
        System.out.println("Array After Inserting new element: ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
