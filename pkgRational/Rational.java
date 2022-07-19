package pkgRational;

public class Rational {
	int numerator,denominator;
	private static Rational zero = new Rational(0, 1);
	public Rational() {
		numerator=0;
		denominator=1;
	}
	public Rational(int x,int y){
		 if (y == 0) {
	          throw new ArithmeticException("denominator is zero");
	    }
		this.numerator = x;
		this.denominator = y;
		normalize();
	}
	
	public Rational(int wholeNumber) {
		numerator = wholeNumber;
		denominator = 1;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void normalize() {
		if(denominator<0) {
			denominator = -denominator;
			numerator = -numerator;
		}
	}
	
	// if a<b return -1 , a=b return 0 , a>b return 1
	public int compare(Rational b) {
		Rational temp = this;
		int left = temp.numerator*b.denominator;
		int right = temp.denominator*b.numerator;
		if(left<right)return -1;
		if(left>right)return 1;
		return 0; 
	}
	
	public boolean equals(Rational y)
	{
		if(y==null)return false;
		return compare(y)==0;
		
	}
	
	public String toString() { 
        if (denominator == 1) return numerator + "";
        
        return (numerator + "/" + denominator);
    }
	
	public static Rational Add(Rational r1, Rational r2) {
		if(r1.compare(zero)==0)return  r2;
		if(r2.compare(zero)==0)return r1;
		
		int n = (int)(r1.numerator*r2.denominator) + (int)(r1.denominator*r2.numerator);
		int d = (int)(r1.denominator*r2.denominator);
		return new Rational(n,d);
	}
	
	public static Rational Sub(Rational r1, Rational r2) {
		return Add(r1, new Rational(-r2.numerator,r2.denominator));
	}
	
	public static Rational Multi(Rational r1,Rational r2) {
		return new Rational(r1.numerator*r2.numerator , r1.denominator*r2.denominator);
	}
	
	public static Rational Div(Rational r1, Rational r2)
	{
		//doing resiprocal of 1 rational number and multiplying with other.
		Rational temp = new Rational(r2.denominator,r2.numerator);
		
		return Multi(r1,temp);
	}

}
