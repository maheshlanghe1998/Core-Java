package array.assignment.passenger;


public class Passenger {

	private int ticketid;
	private String name;
	private String gender;
	private String address;

	public Passenger(int ticketid, String name, String gender, String address) {
	    
		this.ticketid = ticketid;
		this.name = name;
		this.gender = gender;
		this.address = address;

	}
	
	public void display()
	{
		System.out.println("ticketid: "+ticketid);
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("address: "+address);
	}
/*
	public String toString() 
	{
		return "\nticketid: " + ticketid + "\nname: " + name + "\ngender: " + gender + "\naddress: " + address;
	}
*/
}
