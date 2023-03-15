package array.practice;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {56,48,92,34,16,27,81,64};
		
		for(int i=0;i<arr.length;i++)
		{   
			for(int j=0;j<arr.length-1;j++)
		  { 
			int temp=0;
		
			if(arr[j]>arr[j+1])
			{
				temp= arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
			
	  }
		
		for(int i=0;i<arr.length;i++)
		{  
			System.out.print(arr[i]+" ");
		}

	}
}
