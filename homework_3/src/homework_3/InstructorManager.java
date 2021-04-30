package homework_3;

public class InstructorManager {
	
	public void viewCourses(Instructor instructor) {
		
		System.out.println("Eðitimcinin dersleri: " +instructor.getLessons());
	}
	
	public void addCourse(Instructor[] instructor) {
		
		System.out.println(instructor.getClass() +"adlý kurslar eklendi");
	}

}
