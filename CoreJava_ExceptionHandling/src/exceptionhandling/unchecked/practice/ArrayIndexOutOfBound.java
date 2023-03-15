package exceptionhandling.unchecked.practice;

public class ArrayIndexOutOfBound 
{
	public static void main(String args[])
	{
		try
		{
			int arr []= {10,20,30,40};
			
			for(int i=1;i<=arr.length;i++)
			{
				System.out.println(arr[9]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("The exception has been handled.");
	}
    
}
