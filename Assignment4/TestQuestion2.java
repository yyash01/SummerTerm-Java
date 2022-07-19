package Assignment4;

//Assignment 4 , Question 2 solution file
class Points{
	private int x,y;
	public Points(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
class Quadrilateral{
	private Points p1,p2,p3,p4;
	public void setCoordinates(Points p1,Points p2,Points p3,Points p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public Points getP1() {
		return p1;
	}
	public void setP1(Points p1) {
		this.p1 = p1;
	}
	public Points getP2() {
		return p2;
	}
	public void setP2(Points p2) {
		this.p2 = p2;
	}
	public Points getP3() {
		return p3;
	}
	public void setP3(Points p3) {
		this.p3 = p3;
	}
	public Points getP4() {
		return p4;
	}
	public void setP4(Points p4) {
		this.p4 = p4;
	}
}
class Square extends Quadrilateral{
	Square(Points p1,Points p2,Points p3,Points p4){
		setCoordinates(p1,p2,p3,p4);
	}
	int area() {
		int x1 = getP1().getX();
		int x2 = getP2().getX();
		int y1 = getP1().getY();
		int y2 = getP2().getY();
		int side = (int)Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
		return side*side;
		
	}
}
class Rectangle extends Quadrilateral{
	Rectangle(Points p1,Points p2,Points p3,Points p4){
		setCoordinates(p1,p2,p3,p4);
	}
	int area() {
		int x1 = getP1().getX();
		int x2 = getP2().getX();
		int y1 = getP1().getY();
		int y2 = getP2().getY();
		int x4 = getP4().getX();
		int y4 = getP4().getY();
		
		int len = (int)Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
		int breadth = (int)Math.sqrt((x1-x4)*(x1-x4) +(y1-y4)*(y1-y4));
		return len*breadth;
		
	}
}
class Trapezoid extends Quadrilateral{
	private int height;
	Trapezoid(Points p1,Points p2,Points p3,Points p4,int h){
		setCoordinates(p1,p2,p3,p4);
		height = h;
	}
	int area() {
		int x1 = getP1().getX();
		int x2 = getP2().getX();
		int y1 = getP1().getY();
		int y2 = getP2().getY();
		int x4 = getP4().getX();
		int y4 = getP4().getY();
		int x3 = getP3().getX();
		int y3 = getP3().getY();
		
		int len = (int)Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
		int breadth = (int)Math.sqrt((x3-x4)*(x3-x4) +(y3-y4)*(y3-y4));
		return (int)((len+breadth)*height)/2;
		
	}
}
class Parallelogram extends Quadrilateral{
	private int height;
	Parallelogram(Points p1,Points p2,Points p3,Points p4,int h){
		setCoordinates(p1,p2,p3,p4);
		height = h;
	}
	int area() {
		int x1 = getP1().getX();
		int x2 = getP2().getX();
		int y1 = getP1().getY();
		int y2 = getP2().getY();
		
		int base = (int)Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
		return (int)((base)*height);
		
	}
}

public class TestQuestion2 {

	public static void main(String[] args) {
		Points a = new Points(0,0);
		Points b = new Points(0,2);
		Points c = new Points(2,2);
		Points d = new Points(2,0);
		
		Square A = new Square(a,b,c,d);
		System.out.println("Area of Square is : "+A.area());
		
		Points e = new Points(3,0);
		Points f = new Points(3,2);
		Rectangle B = new Rectangle(a,b,e,f);
		System.out.println("Area of Rectangle is : "+B.area());
		
		Points g = new Points(1,2);
		Points h = new Points(5,2);
		Points i = new Points(4,0);
		Parallelogram C = new Parallelogram(a,i,g,h,2);
		System.out.println("Area of Parallelogram is : "+C.area());
		
		Points j = new Points(-1,0);
		Points k = new Points(7,0);
		Trapezoid D = new Trapezoid(j,k,b,h,2);
		System.out.println("Area of Trapezoid is : "+D.area());

	}

}
/*
Output :

Area of Square is : 4
Area of Rectangle is : 6
Area of Parallelogram is : 8
Area of Trapezoid is : 13

*/
