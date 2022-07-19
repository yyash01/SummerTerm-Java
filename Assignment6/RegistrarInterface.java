package Assignment6;

public interface RegistrarInterface {
	
	//student Management
	void addStudent(Student st);
	
	
	//Course Management
	public void createCourse();
	public void displayCourse();
	
	
	//results
	public void BranchWiseStudents();
	public void CourseWiseStudents();
	public void EachStudentCourses();
	public void EachStudentElectiveCourses();
	
}
