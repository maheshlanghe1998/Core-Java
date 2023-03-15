 package basics;

import java.util.Scanner;

public class SpellCheck {
    
	public static void main(String[] args) {
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter 1st character: ");
		 if(sc.next().charAt(0)!='R')
			 count++;
		 System.out.println("Enter 2nd character: ");
		 if(sc.next().charAt(0)!='A')
			 count++;
		 System.out.println("Enter 3rd character: ");
		 if(sc.next().charAt(0)!='I')
			 count++;
		 System.out.println("Enter 4th character: ");
		 if(sc.next().charAt(0)!='N')
			 count++;
		 System.out.println("Enter 5th character: ");
		 if(sc.next().charAt(0)!='B')
			 count++;
		 System.out.println("Enter 6th character: ");
		 if(sc.next().charAt(0)!='O')
			 count++;
		 System.out.println("Enter 7th character: ");
		 if(sc.next().charAt(0)!='W')
			 count++;
		 
		 if(count==0)
		 {
			 System.out.println("RAINBOW");
		 }
	}

}
