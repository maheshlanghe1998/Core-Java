package assignment.day3;

import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter car name: ");
		String carName=sc.next();
		System.out.println("Enter the car no: ");
		int carNo= sc.nextInt();
		System.out.println("Enter the price: ");
		double carPrice = sc.nextDouble();
		
		System.out.println("\ncarname:"+carName+"\ncarno:"+carNo+"\ncarprice:"+carPrice);
	}

}
