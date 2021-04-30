package homework_3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirsName() +user.getLastName() +"Kullanýcý sisteme eklendi");
	}
	public void remove(User user) {
		
		System.out.println(user.getFirsName() +user.getLastName() +"Kullanýcý sistemden silindi");
	}

}
