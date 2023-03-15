package array.practice;

public class ArrayOddEvenElement {

	public static void main(String[] args) {
		int [] arr= {10,53,89,46,47,23,80,44,51,13,7,3,26};
		
		System.out.println("Even Number: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
			
			
		}
		System.out.println("\nOdd Number: ");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2!=0)
			{
				System.out.print(arr[j]+" ");
			}
			
		}
	}

}
