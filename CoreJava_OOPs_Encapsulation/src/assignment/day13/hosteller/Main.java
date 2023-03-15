package assignment.day13.hosteller;

import java.util.Scanner;

public class Main {
	
	public static Hosteller getHostellerDetails()
	{   
		Hosteller h= new Hosteller();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Details: ");
		
		System.out.println("Student Id");
		h.setStudentId(sc.nextInt());
		
		System.out.println("Student Name");
		h.setName(sc.next());
		
		System.out.println("Department Id");
		h.setDepartmentId(sc.nextInt());
		
		System.out.println("Gender");
		h.setGender(sc.next());
		
		
		System.out.println("Phone Number");
		h.setPhone(sc.next());
	
		
		System.out.println("Hostel name");
		h.setHostelName(sc.next());
	
		
		System.out.println("Room Number");
		h.setRoomNumber(sc.nextInt());
		return h;

	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Main m= new Main();
		
		Hosteller h1= getHostellerDetails();
		char ch,ch1;
		
		System.out.println("Modify Room No(Y/N)");
		 ch=sc.next().charAt(0);
		if(ch=='Y')
		{
			System.out.println("New Room No");
			h1.setRoomNumber(sc.nextInt());
		}
		
		
		System.out.println("Modify Phone No(Y/N)");
		 ch1=sc.next().charAt(0);
		if(ch1=='Y') 
		{
			System.out.println("New Phone No");
			h1.setPhone(sc.next());
		}
		
		h1.displayDetails();
		
	}

}
