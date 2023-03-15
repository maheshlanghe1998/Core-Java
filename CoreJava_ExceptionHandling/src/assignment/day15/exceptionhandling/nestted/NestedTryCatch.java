package assignment.day15.exceptionhandling.nestted;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		System.out.println("Hello Mahi");
		
		int p=190;int q=0;
		int r=p/q;
		System.out.println(r);
		try {
			
			int a=10;int b=0;
			int c= a/b;
			System.out.println(c);
			try
			{
				
				int arr[]= {10,20,30,40};
				for(int i=1;i<=arr.length;i++)
				{
					System.out.println(arr[10]);
				}
				
				
				int x=30,y=0;
				int z = x/y;
				System.out.println(z);
				
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
				
			}
			
		}
		catch(ArithmeticException e1)
		{ 
			e1.printStackTrace();
			
			try
			{
				String arr1[]= {"Mahesh","mahi","Siddhesh","sid"}; 
				for(int s=1;s<=arr1.length;s++)
				{
					System.out.println(arr1[10]);
				}
				
			}
			catch(StringIndexOutOfBoundsException e2)
			{
				e2.printStackTrace();
	
			}
			
		}
		
		int l=40, m=0;
		int n=l/m;
		System.out.println(n);
		

	}

}
