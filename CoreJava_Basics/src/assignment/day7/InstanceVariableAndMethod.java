package assignment.day7;


public class InstanceVariableAndMethod {

	int a,b; //instance variable
	
	public void sum()
	{
		//**instance area**//
		a=10;b=20;;
		int c= a+b;
		System.out.println("The sum is: "+c);
	}
	
	public int sum1()
	{
		//**instance area**//
		
		a=40;b=50;;
		int c= a+b;
		return c;
		
	}
	
	 public int sum2()
	{
		//**instance area**//
		 
		InstanceVariableAndMethod obj1=new InstanceVariableAndMethod();
		obj1.a=50; obj1.b=60;;
		int c= obj1.a+obj1.b;
		return c;
		
	}
	
	 
	public static void main(String[] args) {
		//**static area**//
		
		//case-1:
		InstanceVariableAndMethod obj=new InstanceVariableAndMethod();
		obj.sum();
		
		//case-2: 
		//System.out.println("The sum is: "+obj.sum1());
		//or
		int add=obj.sum1();
		System.out.println("The sum is: "+add);
		
		
		//case-3:
		
		//System.out.println("The sum is: "+obj.sum2());
		//or
		int addition=obj.sum2();
		System.out.println("The sum is: "+addition);
			
	}

}
