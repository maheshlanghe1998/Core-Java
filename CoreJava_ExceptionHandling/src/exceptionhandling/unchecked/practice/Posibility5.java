package exceptionhandling.unchecked.practice;


public class Posibility5 {

	public static void main(String[] args) {
		try
		{
			int a = 1;
			int b=0;
			System.out.println(a/b);
		}
	    catch(Exception a)
		{
	    	a.printStackTrace();
	    	
	    	try
	    	{
	    		String arr []= {"Mahi","Sid","Shub"};
	    		for(int i=1; i<=arr.length;i++)
	    		{
	    			System.out.println(arr[3]);
	    		}
	    	}
	    	catch(ArrayIndexOutOfBoundsException b)
	    	{
	    		System.out.println(b.getMessage());
	    	}
		}

	}

}
