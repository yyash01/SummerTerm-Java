package Assignment4;
//Solution for question-1 of Assignment 4

class Complex{
	private float realPart,imaginaryPart;
	public Complex()
	{
		realPart = 0.0f;
		imaginaryPart = 0.0f;
	}
	public Complex(float realPart,float imaginaryPart) {
		this.imaginaryPart= imaginaryPart ;
		this.realPart = realPart;
	}
	
	public Complex add(Complex obj) {
		
		return new Complex(this.realPart + obj.realPart , 
						this.imaginaryPart + obj.imaginaryPart);
	}
	
	public Complex subtract(Complex obj) {
		
		return new Complex(this.realPart - obj.realPart , 
						this.imaginaryPart - obj.imaginaryPart);
	}
	
	public void printComplexNumbers() {
		System.out.println("("+realPart+","+imaginaryPart+")");
	}
}

public class TestQuestion1 {

	public static void main(String[] args) {
		Complex A = new Complex(1.2f,1.4f);
		Complex B = new Complex(0.4f,0.5f);
		
		A.printComplexNumbers();
		B.printComplexNumbers();
		
		Complex C = A.add(B);
		
		C.printComplexNumbers();
		
		Complex D = B.subtract(C);
		
		D.printComplexNumbers();
		

	}

}
/*
Output :

(1.2,1.4)
(0.4,0.5)
(1.6,1.9)
(-1.2,-1.4)

*/
