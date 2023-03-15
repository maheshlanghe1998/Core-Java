package assignment.day13.rational;

public class RationalMain {

	
		public static void main(String args[])
		{
			Rational r= new Rational(40,44);
			System.out.println(r);
			
			Rational a= new Rational(9,13);
			Rational b= new Rational(3,12);
			
			Rational c= a.add(b);
			Rational d= a.subtract(b);
			Rational e= a.multiply(b);
			Rational f= a.divide(b);
			
			System.out.println("Addition: ("+a+") + ("+b+") = ("+c+")");
			System.out.println("Substraction: ("+a+") - ("+b+") = ("+d+")");
			System.out.println("Multiplication: ("+a+") * ("+b+") = ("+e+")");
			System.out.println("Division: ("+a+") / ("+b+") = ("+f+")");
			System.out.println("GCF Value: "+ r.gcf(12, 8));
		    System.out.println("Equals: "+r.equals(r));
			System.out.println("Decimal Value: "+r.decimalValue());
			System.out.println("Defined Value: "+r.isDefined());
		    
		 
			
		}
	}


