package odevler;

public class Main {

	public static void main(String[] args) {
		User senpai= new User(1,"Senpai","12345","Senpai@hey.com");
		UserManager userManager=new UserManager();
		userManager.register(senpai);
		userManager.login(senpai);

	}

}
