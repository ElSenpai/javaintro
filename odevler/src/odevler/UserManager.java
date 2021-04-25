package odevler;

public class UserManager {
	
	public void register(User user) {
		System.out.println("Kayýt olundu");
	}
	
	public void login(User user) {
		if(user.password=="12345")
			System.out.println("Giriþ Baþarýlý "+user.fullName+ " Hoþ geldiniz");
		else
			System.out.println("parola yanlýþ");
	}

}
