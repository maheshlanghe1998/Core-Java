package array.assignment;

import java.util.Scanner;

public class AllEvenArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
