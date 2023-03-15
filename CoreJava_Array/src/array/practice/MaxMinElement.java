package array.practice;

public class MaxMinElement {

	public static void main(String[] args) {
		
		int arr[]= {62,89,75,45,62,10,73,5,14};
		int max =arr[0],min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number: "+max);
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("Minimum Number: "+min);
		

	}

}
