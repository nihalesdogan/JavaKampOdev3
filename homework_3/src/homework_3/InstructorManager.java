package homework_3;

public class InstructorManager {
	
	public void viewCourses(Instructor instructor) {
		
		System.out.println("E�itimcinin dersleri: " +instructor.getLessons());
	}
	
	public void addCourse(Instructor[] instructor) {
		
		System.out.println(instructor.getClass() +"adl� kurslar eklendi");
	}

}
