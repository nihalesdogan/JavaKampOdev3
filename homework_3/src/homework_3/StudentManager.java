package homework_3;

public class StudentManager {
	
	public void viewsProject(Student student) {
		
		System.out.println(student.getFirsName()+"�simli ��rencinin projeleri: " +student.githubAdress +" linkte bulunmaktad�r.");
		
	}
	
	public void showCourses(Student student,Instructor instructor ) {
		
		System.out.println(student.getFirsName()+student.getLastName()+"�simli ��renci " +instructor.getFirsName()+instructor.getLastName()+" ��retmenin ��rencisidir.");
	}

}
