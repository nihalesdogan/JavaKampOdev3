package homework_3;

public class User {
	int id;
	String firsName;
	String lastName;
	String mail;
	String githubAdress;
	
	public User() {
		super();
		
	}
	public User(int id, String firsName, String lastName, String mail, String githubAdress) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.mail = mail;
		this.githubAdress = githubAdress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGithubAdress() {
		return githubAdress;
	}
	public void setGithubAdress(String githubAdress) {
		this.githubAdress = githubAdress;
	}
	

}
