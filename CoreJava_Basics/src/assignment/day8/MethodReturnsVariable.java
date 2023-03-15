package assignment.day8;

public class MethodReturnsVariable {
    //Instance variables:
	int a=10;
	int b=20;
	
	//static Variables: 
	static int x=100;
	static int y=200;
	
	
	int sum(int a,int b) 
	{
		//return a+b; -->> it return the result for local variables
		return this.a+this.b; // -->> it returns result for instance variable. 
		
		
		
	}
	
	
	static int sum1(int x,int y) 
	{
		
		//return x+y;
		return MethodReturnsVariable.x+MethodReturnsVariable.y; //it returns result for static variable.
		
		
	}
	public static void main(String[] args) {
		
		MethodReturnsVariable obj = new MethodReturnsVariable();
		 System.out.println("The Sum is "+obj.sum(50, 50));
		 
		 System.out.println("The Sum is "+MethodReturnsVariable.sum1(40,40));
		 

	}

}
