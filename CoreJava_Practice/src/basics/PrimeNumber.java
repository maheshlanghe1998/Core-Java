package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		char ch;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("please Enter the Number: ");
			int num = sc.nextInt();
			int count = 0;
			if (num > 1) 
			{
				for (int i = 1; i <= num; i++) 
				{
					if (num % i == 0) 
					{
						count++;

					}
				}

				if (count == 2) 
				{
					System.out.println("Its prime number");
				}

				else 
				{
					System.out.println("Its Not Prime Number");
				}
			}

			else 
			{
				System.out.println("The Number is not Prime");
			}

			System.out.println("Do you want to continue? y or n");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
