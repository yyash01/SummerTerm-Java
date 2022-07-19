package Assignment2;
import java.util.Scanner;

class Student{
	String name;
	
	Student(){
		name = "Unknown";
	}
	Student(String stuName){
		name = stuName;
	}
}

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student stu1 = new Student();
		
		System.out.print("Enter the student name :");
		String s = sc.next();
		
		Student stu2 = new Student(s);
		
		System.out.println("Student - 1 : "+stu1.name);
		System.out.println("Student - 2 : "+stu2.name);
		
		sc.close();
	}

}
