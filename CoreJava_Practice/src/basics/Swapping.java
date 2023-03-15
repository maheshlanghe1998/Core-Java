package basics;

public class Swapping {

	public static void main(String[] args) {
		
		//using 3rd variable:
		
		int a=10,b=20;
		System.out.println("Before Swapping:"+a+" "+b);
		int temp;
		
		temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping:"+a+" "+b);	
        
		System.out.println("\n************************");
		//Without using 3rd variable:
	     int x=10,y=20;
		System.out.println("Before Swapping:"+x+" "+y);
	
		x=x+y;  //30
		y=x-y;   //10
		x=x-y;
		System.out.println("After Swapping:"+x+" "+y);
		
		
	}

}
