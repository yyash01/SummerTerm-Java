package Assignment2;

public class Person {
	//instance variables :-
	String name;
	int age,salary;
	
	Person(String personame){
		name = personame;
	}
	
	public void setage(int AGE) {
		age = AGE;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	
	//method will print the person details
	public void printPerson() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary+"\n");
		
	}

	public static void main(String[] args) {
		Person p1 = new Person("Ajay");
		Person p2 = new Person("Raj");
		
		p1.setage(34);
		p2.setage(12);
		
		p1.setSalary(14000);
		p2.setSalary(20000);
		
		p1.printPerson();
		p2.printPerson();
	}
}
