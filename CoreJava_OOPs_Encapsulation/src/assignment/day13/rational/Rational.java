package assignment.day13.rational;


public class Rational 
{
    int p;
    int q;
    boolean defined;
    
    Rational()
    {
    	
    }
    
    Rational(int p, int q)
    {
       this.p=p;
       this.q=q;
       
    }

	public int getP() {
		return p;
	}

	public void setP(int newP) {
		this.p = newP;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int newQ) {
		this.q = newQ;
	}
    
	Rational add(Rational r)
	{
		//math calculation for addition of rational numbers
		//(x1,y1) + (x2,y2) = (x1 × y2 + x2 × y1, y1 × y2)
		Rational r1= new Rational(0,0);
        r1.p = p* r.q + r.p * q;
        r1.q = q * r.q;
        return r1;
		
	}
	
	Rational subtract(Rational r)
	{   
		//math calculation for Subtraction of rational numbers
		//(x1,y1) - (x2,y2) = (x1 × y2 + x2 × y1, y1 × y2)
		Rational r1= new Rational(0,0);
        r1.p = p* r.q - r.p * q;
        r1.q = q * r.q;
        return r1;
		
	}
	
	Rational multiply(Rational r)
	{    
		//math calculation for multiplication of rational numbers
				//(x1,y1) × (x2,y2) = (x1 × x2,y1 × y2)
				
				Rational r1= new Rational(0,0);
		        r1.p = p* r.p ;
		        r1.q = q * r.q;
		        return r1;
		
		
	}
    
	Rational divide(Rational r)
	{
		
		//math calculation for multiplication of rational numbers
		//(x1,y1) ÷ (x2,y2) = (x1 × y2, x2 × y1)
		
		Rational r1= new Rational(0,0);
        r1.p = p* r.q ;
        r1.q = q * r.p;
        return r1;

	}
	
	
	int gcf(int p,int q)
	{
		while((p%q)>0)
		{
			int temp=p%q;
			 p=q;
			 q=temp;
		}
		return q;
	}
	boolean equals(Rational r)
	{
		 if (!(r instanceof Rational))
	            return false;

	        Rational r1 = (Rational) r;
	        return p == r1.p && q == r1.q;
		
	}
	
	double decimalValue()
	{
		return (double) p/q;
		
	}
	
	boolean isDefined()
	{
		if(p==0)
		{
			defined=false;
		}
		return true;
		
	}
	
	public String toString()
	{
		return  p + "/" + q  ;
		
	}
	
	
}
