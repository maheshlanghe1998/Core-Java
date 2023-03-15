package basics;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Marks of CSE Department: ");
		int cse=sc.nextInt();
		System.out.println("Enter The Marks of CSE Department: ");
		int ece=sc.nextInt();
		System.out.println("Enter The Marks of CSE Department: ");
		int mech=sc.nextInt();
		
		if(cse==0 && ece==0 && mech==0)
		{
			System.out.println("None of the department has got the highest placements");
		}
		else if(cse>=0 &&ece>=0 && mech>=0)
		{
              if(cse>ece &&cse>mech)
              {
            	  System.out.println("Highest placement\nCSE");
              }
              else if(ece>cse && ece>mech)
              {
            	  System.out.println("Highest placement\nECE");
              }
              else if(mech>ece &&mech>cse)
              {
            	  System.out.println("Highest placement\nMECH");
              }
              else if(cse==ece)
              {
            	  System.out.println("Highest placement\nCSE\nECE");
              }
              else if(cse==mech)
              {
            	  System.out.println("Highest placement\nCSE\nMECH");
              }
              else if(ece==mech)
              {
            	  System.out.println("Highest placement\nECE\nMECH");
              }
			
		}
		else
		{
			System.out.println("Input is Invalid");
		}

	}

}
