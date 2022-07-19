package HomePractice;



class Animal{
	int x,y,z;
	
	public Animal() {
		System.out.println("Created");
	}
	public void m1() {
		System.out.println("method in Anima M1");
	}
	void run() {
		System.out.println("OP");
	}

}

class Dog extends Animal{
	Dog(){
		this(5);
		System.out.println("empty constructor in Dog is created");
	}
	Dog(int x){
		System.out.println(x);
	}
	public void m1() {
		System.out.println("method in Dog M1");
	}
}

class pr1{

		public static void main(String args[]){
		
		Animal d=new Dog();
		d.m1();
		

	}
}
