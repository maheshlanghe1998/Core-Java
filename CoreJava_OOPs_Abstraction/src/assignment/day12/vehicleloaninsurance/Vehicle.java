package assignment.day12.vehicleloaninsurance;

public class Vehicle implements Insurance,Loan
{
	static double loanAmount;
	
	static double insuranceAmount;
	
	private String vehicleNumber;

	private String modelName;

	private String vehicleType;

	private double price;

	Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double issueLoan()
	{
		if(vehicleType=="4-wheeler")
		{
		    loanAmount=(0.85*price);
			
			return loanAmount;
		}
		else if(vehicleType=="3-wheeler")
		{
			 loanAmount=(0.75*price);
			
			return loanAmount;
		}
		else if(vehicleType=="2-wheeler")
		{
		     loanAmount=(0.50*price);
			
			return loanAmount;
		}
		return 0;
	}
	
	public double takeInsurance()
	{    
		if(price==150000)
		{
			return insuranceAmount=3500;
		}
		else if(price>150000 && price<=300000)
		{
			return insuranceAmount=4000;	
		}
		else if(price>300000)
		{
			return insuranceAmount=5000;	
		}
		return 0;
	}

}
