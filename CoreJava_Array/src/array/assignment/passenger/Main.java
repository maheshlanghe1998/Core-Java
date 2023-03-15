package array.assignment.passenger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no.of passengers:");
		int passenger = sc.nextInt();
		
		
		Passenger[] obj=new Passenger[passenger];
		
		for(int i=0;i<passenger;i++)
		{
			System.out.println("Passenger "+(i+1));
			
			System.out.println("Enter the ticketid: ");
			int id = sc.nextInt();
			
			System.out.println("Enter the name: ");
			String name = sc.next();
			
			System.out.println("Enter the gender: ");
			String gender = sc.next();
			
			System.out.println("Enter the address: ");
			String address = sc.next();
			
			obj[i]=new Passenger(id, name, gender, address);
		}
         
		for(int i=0;i<passenger;i++)
		{
			obj[i].display();
		}
		
	}

}
