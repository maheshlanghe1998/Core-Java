package assignment.day13.hosteller;

public class Hosteller extends Student {
	private String hostelName;

	private int roomNumber;

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	/*
	public void displayDetails()
	{
		
		System.out.println("The Student details: ");
		System.out.print(studentId+" "+name+" "+departmentId+" "+gender+" "+phone+" "
		                    +hostelName+" "+roomNumber);
	}
	*/

	public void displayDetails()
	{
		super.displayDetails();
		System.out.print(" "+hostelName+" "+roomNumber);
	}
	
	
}
