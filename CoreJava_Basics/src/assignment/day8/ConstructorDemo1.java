package assignment.day8;

public class ConstructorDemo1 {
	
	ConstructorDemo1()
	{   this(1,2);
		System.out.println("zero");
	}
	ConstructorDemo1(int a,int b)
	{
		this("Hi, Mahi");
	  	System.out.println(a+b);
	}
	ConstructorDemo1(String s)
	{
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		  new ConstructorDemo1();
		  
	}

}
