package homework_3;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setFirsName("Nihal");
		user.setLastName("E�do�an");
		user.setGithubAdress("https://github.com/nihalesdogan");
		
		Instructor instructor=new Instructor();
		instructor.setFirsName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setLessons("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.viewCourses(instructor);
		
		
		
	}

}
