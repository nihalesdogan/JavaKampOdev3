package homework_3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirsName() +user.getLastName() +"Kullan�c� sisteme eklendi");
	}
	public void remove(User user) {
		
		System.out.println(user.getFirsName() +user.getLastName() +"Kullan�c� sistemden silindi");
	}

}
