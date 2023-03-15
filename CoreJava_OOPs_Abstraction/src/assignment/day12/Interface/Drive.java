package assignment.day12.Interface;

public class Drive {

	
	public static void main(String[] args) {
		
		ClassTwo obj1 =new ClassTwo();
		obj1.methodOne();
		obj1.methodTwo();
		obj1.methodThree();
        obj1.methodFour();
        
        ClassOne co =new ClassTwo() ;
       
        ClassTwo obj2= (ClassTwo)co;
        obj2.methodOne();
        obj2.methodTwo();
        
	}

}
