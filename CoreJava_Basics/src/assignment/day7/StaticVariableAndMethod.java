package assignment.day7;


public class StaticVariableAndMethod {
	
	static int a;
	static int b;
		
	public static void sum1()
	
	{ 
		//**instance area**//
		
		a=40;b=20;
	
		int c=a+b;
		System.out.println("the Sum is: "+c);
	}
	
	public static int sum2()
	{  
		//**instance area**//
		
		a=40;b=40;
	
		int c=a+b;
		return c;
		
	}


	public static void main(String[] args) {
		//**static area**//
		
		
		//method-1:
		StaticVariableAndMethod.sum1();
		//or
        // sum1();
        
		//Method-3:
		int add=sum2();
		 System.out.println("The Sum is: "+add);
		//or 
		//System.out.println("The Sum is: "+sum2());
	}

}
