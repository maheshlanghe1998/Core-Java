package assignment.day12.vehicleloaninsurance;

public class MainVehicle {

	public static void main(String[] args) {
		
		Vehicle vehicleObj= new Vehicle("AD-4141", "XUV700", "4-wheeler", 1300000);
		
		System.out.println("The Loan Amount is:  "+vehicleObj.issueLoan());
		System.out.println("The Insurance Amount is: "+vehicleObj.takeInsurance());

	}

}
