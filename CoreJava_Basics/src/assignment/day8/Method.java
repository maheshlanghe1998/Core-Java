package assignment.day8;

class A
{
	void sum1(int a,int b)
	{   
		int c=a+b;
		
		System.out.println("The sum is: "+c);
	}
}

class B
{
	void sum2(int x, int y)
	{
        int z=x+y;
		
		System.out.println("The sum is: "+z);
	}
}
public class Method {
	
	A sum3()
	{
		A a1=new A(); //named approach
		
		return a1;
	}
	
	B sum4()
	{
		return new B(); //nameless approach
	}
	
	//**method returning same class object**//
	
	Method m1()
	{
		System.out.println("mahesh langhe");
		
		return new Method();
		
	}

	public static void main(String[] args) {
		Method obj= new Method();
		A a11 =obj.sum3();
		a11.sum1(10,20);  //method of class A
		
		B b11 =obj.sum4();
		b11.sum2(20,40); //method of class A
		
		obj.m1();
		//System.out.println(obj.m1());// it will print address of class.

	}

}
