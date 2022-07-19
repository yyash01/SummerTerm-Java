package Assignment5;
import pkgRational.Rational;

public class TestRationalClass {

	public static void main(String[] args) {
		
		Rational a,b,c;
		a = new Rational(1,2);
		b = new Rational(1,3);
		c = Rational.Add(a, b);
		
		System.out.println(c);
		
		c = Rational.Multi(a, b);
		
		System.out.println(c);
		
		c = Rational.Div(a, b);
		
		System.out.println(c);
		
		c = Rational.Sub(a, b);
		
		System.out.println(c);
		
		if(a.equals(b)) {
			System.out.println("a and b are equal");
		}
		else System.out.println("Not equal");
		
		Rational d = new Rational(1,-2);
		System.out.println(d.toString());
		
	}
}
/*
 * Output : 
 * 
 * 5/6 
 * 1/6 
 * 3/2 
 * 1/6 
 * Not equal 
 * -1/2
 */


