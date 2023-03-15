package assignment.day7;


//local variables :
//1. the variable which is accessible within the method, block and constructor is called  as local variable.
//2. the scope of the local variable is limited for that method only.



public class LocalVariableDemo {
	void sum1()
	{
		//**instance area**//
		

		//int add=x+y; -->> it will throw an compile time error as scope of x,y is limited to main method only.
		
		int p=30,q=40;
		int r=p+q;
		System.out.println("The sum is: "+r);
		
		
	}
	
	int sum2(int a,int b)
	{
		//**instance area**//
		
		int c=a+b;
		return c;
		
	}
	
	int sum3(int a,int b)
	{
		//**instance area**//
		
		return a+b;
		
	}
	
	

	public static void main(String[] args) {
		
		//**static area**//
		//case -1: 
		int x=10;int y=20;//local variables
		int z=x+y;
		//System.out.println("The sum is "+(x+y));
		//or
		System.out.println("The sum is: "+z);
		
		//case -2: 
		LocalVariableDemo obj=new LocalVariableDemo();
				obj.sum1();
				
		//case -3: 
		int add=obj.sum2(100, 200);
		System.out.println("The Sum is: "+add);
		
		//case-4: 
		System.out.println("The sum is: "+obj.sum3(15, 30));
		
	}

}


