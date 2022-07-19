package Assignment6;

public class Student{
	private int Rollno,Semester;
	private String Name;
	public boolean enrolled;
	private String Branch;
	
	//constructor
	public Student() {
		Rollno = 0;
		Semester = 1;
		setName("");
		enrolled=false;
		Branch="NA";
	}
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public boolean isEnrolled() {
		return enrolled;
	}
	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	
}
