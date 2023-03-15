package basics;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		     @SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
		     char ch ;
		     do
		     {
		    	 System.out.println("Please enter The Number: ");
			     int num=sc.nextInt();
					if(num%2==0)
					{
						System.out.println("Even Number");
					}
					else
					{
						System.out.println("odd Number");
					}
					
		    	 System.out.println("Do you want  to continue? y or n");
		    	 ch=sc.next().charAt(0);
		    	 
		     }while(ch=='y'|| ch =='Y');
		     
		    
				
	}

}
