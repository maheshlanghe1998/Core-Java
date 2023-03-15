package assignment.day12.practice;

//if there is any abstract method in class then class should be known abstract class.
abstract class AbstractClassParent
 {
	// abstract private static void m1(); //-- we can't declared abstract method as static or private
	
	 abstract public void m1(); //if there is any abstract method in class then class should be abstract
    
	public void m2()
	{
		System.out.println("This is concreate method in abstract class");
	}
	
 }
 
 class AbstractClassChild extends AbstractClassParent
 {
	 public void m1()
	{
		System.out.println("This is implementation of abstract class");
	}
 }
 
 
 public class AbstractClassMain {
	   
	public static void main(String[] args) {
		
		AbstractClassParent acp=new AbstractClassChild(); // Up-casting or implicit 
		acp.m1();
		acp.m2();
		
		AbstractClassChild acc =new AbstractClassChild(); //this is normal child class object creation
        acc.m1();
        acc.m2();
        
        AbstractClassChild acc1 = (AbstractClassChild) acp;  // down-casting or explicit
        acc1.m1();
        acc1.m2();
        
	}

}
