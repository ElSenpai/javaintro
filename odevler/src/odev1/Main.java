package odev1;


public class Main {

	public static void main(String[] args) {
		User senpai= new User(1,"Senpai","12345","Senpai@hey.com");
		Education java = new Education(1,"Java Kampı","Engin Demiroğ",true);
		EducationManager eduManager=new EducationManager();
		UserManager userManager=new UserManager();
		userManager.register(senpai);
		userManager.login(senpai);
		
		eduManager.add(java, senpai);
		eduManager.remove(java, senpai);

	}

}
