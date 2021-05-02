package odev1;

public class User {

	
	int id;
	String fullName;
	String password;
	String email;
	public User() {
		
	}
	public User(int id,String fullName,String password,String email) {
		this.id=id;
		this.fullName=fullName;
		this.email=email;
		this.password=password;
	}
}
