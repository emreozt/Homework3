package Homework3;

public class Student extends User{
	
	private String school;
	
	
	
	public Student() {
		
	}
	
	public Student(String school) {
		
		this();
	
		this.school = school;
		
	}
	

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}
