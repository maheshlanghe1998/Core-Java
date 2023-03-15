 package assignment.day12.practice;

interface A
{  
	public final static int a=100;  //interface fields are "public static final" by default.
	 int b=200;

	void m1(); //by default "abstract public".
	void m2();
	
	//we can use static method with Interface 
	public static void m11()
	{
		System.out.println("This is Normal Method");
	}
	
	//we can use default method with Interface 
	default void m12()
		{
			System.out.println("This is default Method");
		}
}

interface B  extends A
{   
	
	void m3();
	void m4();
	
}

interface C 
{
	int a=1000,b=2000;
	
	void m1();
	
}

// we can achieve multiple inheritance with interface

class InterfaceDemo implements A,B,C
{
	
	public void m1()
	{
		System.out.println("The sum is: "+(A.a+C.b));
	}
	
	public void m2()
	{
		System.out.println("This is method m2");
	}
	
	public void m3()
	{
		System.out.println("This is method m3");
	}
	
	public void m4()
	{
		System.out.println("This is method m4");
	}
}

public class InterfaceDemoMain {

	public static void main(String[] args) 
	{
		InterfaceDemo obj = new InterfaceDemo();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	    A.m11();
	    //A.m12();
	   
	    //A obj1= new A(); ... we can not instantiate the interface
		
	}

}
