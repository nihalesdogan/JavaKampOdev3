package homework_3;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setFirsName("Nihal");
		user.setLastName("Eþdoðan");
		user.setGithubAdress("https://github.com/nihalesdogan");
		
		Instructor instructor=new Instructor();
		instructor.setFirsName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setLessons("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.viewCourses(instructor);
		
		
		
	}

}
