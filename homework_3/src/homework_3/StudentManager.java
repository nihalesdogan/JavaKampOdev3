package homework_3;

public class StudentManager {
	
	public void viewsProject(Student student) {
		
		System.out.println(student.getFirsName()+"Ýsimli öðrencinin projeleri: " +student.githubAdress +" linkte bulunmaktadýr.");
		
	}
	
	public void showCourses(Student student,Instructor instructor ) {
		
		System.out.println(student.getFirsName()+student.getLastName()+"Ýsimli öðrenci " +instructor.getFirsName()+instructor.getLastName()+" öðretmenin öðrencisidir.");
	}

}
