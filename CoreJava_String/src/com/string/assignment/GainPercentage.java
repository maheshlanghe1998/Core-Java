package com.string.assignment;

import java.util.Scanner;

public class GainPercentage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Price of old scooter: ");
		int oldPrice=sc.nextInt();
		System.out.println("The amount spent for repair: ");
		int repairPrice=sc.nextInt();
		System.out.println("Sold Price");
		int soldPrice = sc.nextInt();
		
		if(oldPrice<=0 || repairPrice<=0 ||soldPrice<=0)
		{
			System.out.println("Incorrect Inputs");
		}
		else
		{
			if(soldPrice<(oldPrice+repairPrice))
			{
				System.out.println("Unable to calculate Gain Percentage");
			}
			else
			{
			    float profit=soldPrice-(oldPrice+repairPrice);
				float gainPercentage=(profit/(oldPrice+repairPrice))*100;
			    System.out.println(gainPercentage);
				System.out.printf("Gain percentage is %.2f ",gainPercentage);
			}
		}
	}

}
