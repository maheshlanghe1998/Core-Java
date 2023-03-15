package assignment.day3;

import java.util.Scanner;

public class BillGenration {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no of pizzas bought: ");
		int pizzas=sc.nextInt();
		System.out.println("Enter the no of puffs bought: ");
		int puffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought: ");
		int coolDrinks=sc.nextInt();
		
		int totalPrice=(pizzas*100)+(puffs*20)+(coolDrinks*10);
		
		System.out.println
		       ("Bill Details"+
				"\nNo of pizzas:"+pizzas+
				"\nNo of puffs:"+puffs+
				"\nNo of cooldrinks:"+coolDrinks+
				"\nTotal price="+totalPrice+
				"\nENJOY THE SHOW!!!" 
				);

				
	}

}
