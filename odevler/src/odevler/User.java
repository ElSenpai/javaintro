package odevler;

public class User {
	
	public User() {
		
	}
	public User(int id,String fullName,String password,String email) {
		this.id=id;
		this.fullName=fullName;
		this.email=email;
		this.password=password;
	}
	
	int id;
	String fullName;
	String password;
	String email;
	

}
