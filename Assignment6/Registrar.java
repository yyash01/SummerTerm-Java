package Assignment6;
import java.util.Scanner;

public class Registrar implements RegistrarInterface {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addStudent(Student st) {
		//Add the students rollNo. CurrentSemester,Name
		int t=1;
		System.out.println("Enter Semester of Student");
		int x = sc.nextInt();
		st.setSemester(x);
		st.setRollno(t);t++;
		System.out.println("Enter Name of Student");
		String name = sc.nextLine();
		st.setName(name);	
		
		//take student preferences
		System.out.println("Enter Your Four Branch Preferences in any order");
		System.out.println("Press 1 for CSE");
		System.out.println("Press 2 for ECE");
		System.out.println("Press 3 for CCE");
		System.out.println("Press 4 for ME");
		int pref[] = new int [4];
		for(int i=0;i<4;i++) {
			pref[i]=sc.nextInt();
		}
		//iterating over preferences
		for(int p : pref) {
			if(p==1) {
				//CSE Branch
				if(cse.getSeats()>0) {
					//we can enroll this student in this Branch
					break;
				}
			}
			if(p==2) {
				//ECE Branch
				if(ece.getSeats()>0) {
					//we can enroll this student in this Branch
					break;
				}
			}
			if(p==3) {
				//CCE Branch
				if(cce.getSeats()>0) {
					//we can enroll this student in this Branch
					break;
				}
			}
			if(p==4) {
				//ME Branch
				if(me.getSeats()>0) {
					//we can enroll this student in this Branch
					break;
				}
			}
		}
		
	}

	@Override
	public void createCourse() {
			
	}

	@Override
	public void displayCourse() {
		
	}

	@Override
	public void BranchWiseStudents() {
		
	}

	@Override
	public void CourseWiseStudents() {
	}

	@Override
	public void EachStudentCourses() {
		
	}

	@Override
	public void EachStudentElectiveCourses() {
		
	}
}
