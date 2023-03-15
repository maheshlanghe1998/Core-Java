package array.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: "); //5
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		int arr1[]=new int[arr.length];
		
		int flag=0;
		
		System.out.println("Enter all the elements: "); //10 50 30 10 40 20 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		Arrays.sort(arr);
		
		//10 10 20 30 40 50
		for(int i=0;i<arr.length-1;i++)   //0 to 4  0<4 true
		{                                 //iteration 1:              iteration 2              iteration 3                 iteration 4
			if(arr[i]!=arr[i+1])          //arr[0]!=arr[1]...10!=10   arr[1]!=arr[2]...10!=20  arr[2]!=arr[3]..20!=30      arr[3]!=arr[4]..30!=40
			{                             //false                                                               
				arr1[flag]=arr[i];                                   //arr1[0]=arr[1] ....10   arr1[1]=arr[2]...20         arr1[2]=arr[3] ..30   
				flag++;                                              //flag=1                  //flag=2;                   //flag=3
			}
			
			arr1[flag]=arr[arr.length-1];   //arr1[0]=arr[4]....40  //arr1[1]=arr[4]....40    //arr1[2]=arr[4]...40       arr1[3] =arr[4] ....40
		}
		 
		for(int i=0;i<arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" "); 
		}
	}

}
