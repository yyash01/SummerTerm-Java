package Assignment1;
import java.util.Scanner;

class Room {
	private int length,breadth,height;
	
	//specially paramterized constructor
	Room(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	
	public  int Volume() {
		return (length*breadth*height);
	}	

}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the Length, breadth and Height of Room :");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		Room room1 = new Room(a,b,c);
		System.out.println("Volume of Room : "+room1.Volume());
		sc.close();
	}

}
