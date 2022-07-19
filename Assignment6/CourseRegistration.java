package Assignment6;
import java.util.ArrayList;


class Courses{
	String CourseName;
	boolean availaible; // decided by number of seats in this course
	String courseID;
	int semester;
	int maxStudents;
	int EnrolledStudents;
	public  ArrayList<String> students;
	String branch;
}
class CoreCourse extends Courses{
	
}
class ElectiveCourse extends Courses{
}


public class CourseRegistration {

	public static void main(String[] args) {
		Branches cse = new Branches("CSE",250);
		Branches ece = new Branches("ECE",150);
		Branches cce = new Branches("CCE",100);
		Branches me = new Branches("ME",50);
		
	}

}