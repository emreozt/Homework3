package Homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student emre = new Student();
		
		emre.setId(6);
		emre.setFirstname("Emre");
		emre.setLastname("�zt�rk");
		emre.seteMail("emre@hotmail.com");
		emre.setPassword("0606");
		emre.setAddress("Ankara");
		emre.setSchool("D�zce �niversitesi");
		
		
		
		Instructor engin = new Instructor();
		
		engin.setId(16);
		engin.setFirstname("Engin");
		engin.setLastname("Demiro�");
		engin.seteMail("engin@hotmail.com");
		engin.setPassword("1616");
		engin.setAddress("Ankara");
		engin.setCourses("Java");
		
		
		System.out.println(emre.getFirstname());
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.courseOperation();
		
		InstructorManager instructorManager = new InstructorManager();
        instructorManager.edit();
		
		
		
	}

}
