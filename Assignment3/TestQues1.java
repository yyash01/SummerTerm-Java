package Assignment3;

class Rectangle{
	private float length,width;
	
	public Rectangle() {
		length=1.0f;
		width= 1.0f;
	}
	
	public float perimeter() {
		return 2*(length+width);
	}
	
	public float area() {
		return length*width;
	}
	
	float getlen() {
		return length;
	}
	float getwid() {
		return width;
	}
	
	void setlen(float x) {
		if(x<0.0f || x>=20.0f) {
			System.out.println("Invalid length");
			return;
		}
		
		length = x;
	}
	void setwid(float y) {
		if(y<0.0f || y>=20.0f) {
			System.out.println("Invalid width");
			return;
		}
		width = y;
	}
}

public class TestQues1 {

	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		System.out.println("Length : "+a.getlen());
		System.out.println("Width : "+a.getwid());
		
		a.setlen(1.33f);
		a.setwid(34.5f);
		
		a.setwid(15.65f);
		
		System.out.println("Length : "+a.getlen());
		System.out.println("Width : "+a.getwid());
		
		System.out.println("Perimeter of Rectangle a : "+a.perimeter());
		System.out.println("Area of Rectangle a : "+a.area());
	}

}
/*
Output :

Length : 1.0
Width : 1.0
Invalid width
Length : 1.33
Width : 15.65
Perimeter of Rectangle a : 33.96
Area of Rectangle a : 20.8145

*/
