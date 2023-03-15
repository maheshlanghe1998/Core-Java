package methodoverriding;

public class Main {

	public static void main(String[] args) {
		
		ICICIBank ib=new ICICIBank();
		System.out.println("The interest rate of ICICI Bank is: "+ib.getRateOfInterest());
	     SBIBank sb=new SBIBank();
	     System.out.println("The interest rate of SBI Bank is  : "+sb.getRateOfInterest());
	}

}
