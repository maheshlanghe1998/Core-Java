package array.practice;

import java.util.Scanner;

public class TwoDArray {

		 public static void main(String args[]) {
		    
		  
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter the size for 2D array: ");
			 int row = sc.nextInt();
			 int column = sc.nextInt();
			 
			 int arr[][]=new int [row][column];
			 
			 System.out.println("Enter the ekements in 2D array: ");
			 for(int i=0;i<row;i++)
			 {
				 for(int j=0;j<column;j++)
				 {
					 arr[i][j]=sc.nextInt();
				 }
			 }
             System.out.println("\nDisplay 2D array: ");
			 for(int i=0;i<row;i++)
			 {
				 for(int j=0;j<column;j++)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
				 System.out.println();
			 }


	}

}
