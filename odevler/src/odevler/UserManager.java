package odevler;

public class UserManager {
	
	public void register(User user) {
		System.out.println("Kay�t olundu");
	}
	
	public void login(User user) {
		if(user.password=="12345")
			System.out.println("Giri� Ba�ar�l� "+user.fullName+ " Ho� geldiniz");
		else
			System.out.println("parola yanl��");
	}

}
