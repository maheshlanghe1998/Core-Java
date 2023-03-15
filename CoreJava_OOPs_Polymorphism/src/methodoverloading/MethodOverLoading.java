package methodoverloading;

public class MethodOverLoading {
    
	//overloading : method name same+ argument not same
	// return type may be same or different.
	// we can overload final and static method
	
	
   final static void sum(int a, int b)
    {
    	int c= a+b;
    	System.out.println("The sum is: "+c);
    }
   
   
   // overloading by changing the no. of argument  
    static void sum(int a, int b, int c)
    {
    	int d= a+b+c;
    	System.out.println("The sum is: "+d);
    }
    
 // overloading by changing the data types of arguments 
    static void sum(float a, int b, int c)
    {
    	float d= a+b+c;
    	System.out.println("The sum is: "+d);
    }
    
  // overloading by changing the sequence of the argument.
    
    static void sum( int b, float a, int c)
    {
    	float d= a+b+c;
    	System.out.println("The sum is: "+d);
    }
    
    
    //overloading by changing the data types whole 
    static void sum(float a,float b, float c)
    {
    	float d= a+b+c;
    	System.out.println("The sum is: "+d);
    }

	public static void main(String[] args) 
	{  
		
		MethodOverLoading.sum(10, 20);
		MethodOverLoading.sum(10, 20, 30);
		MethodOverLoading.sum(10.22f, 20, 30);
		MethodOverLoading.sum( 20, 10.22f, 30);
		MethodOverLoading.sum(10.22f, 20.00f, 30.23f);
	}

}
