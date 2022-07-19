package Assignment2;

class College{
	int rank;
	String name;
	
	College(int rank,String name){
		this.rank = rank;
		this.name = name;
	}
	
	void print() {
		System.out.println("College Rank :"+rank+" Name : "+name);
	}
}

class CollegeHelper{
	College c;
	CollegeHelper(College c){
		this.c = c;
	}
}

public class Question1 {
	public static void swap(CollegeHelper c1 , CollegeHelper c2) {
		College temp = c1.c;
		c1.c = c2.c;
		c2.c = temp;
	}
	public static void main(String[] args) {
		College col1 = new College(45,"IIT");
		College col2 = new College(2,"LNMIIT");
		
		CollegeHelper c1 = new CollegeHelper(col1);
		CollegeHelper c2 = new CollegeHelper(col2);
		
		c1.c.print();
		c2.c.print();
		swap(c1,c2);
		System.out.println("After Swapping :");
		c1.c.print();
		c2.c.print();

	}

}
