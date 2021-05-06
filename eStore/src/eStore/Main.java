package eStore;



import eStore.business.abstracts.AuthService;
import eStore.business.concretes.AuthManager;
import eStore.core.adapter.EmailLogger;
import eStore.core.adapter.GoogleLoginAdapter;
import eStore.dataAccess.concretes.InMemoryUserDao;
import eStore.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		AuthService hey=new AuthManager(new InMemoryUserDao(),new GoogleLoginAdapter(),new EmailLogger());
		User senpai = new User();
		senpai.setEmail("ahmet@gmail.com");
		senpai.setFirstName("Ahmet");
		senpai.setLastName("Uçar");
		senpai.setId(1);
		senpai.setPassword("123456");
		User senpai1 = new User();
		senpai1.setEmail("ahmet@gmail.com");
		senpai1.setFirstName("Ahmet");
		senpai1.setLastName("Uçar");
		senpai1.setId(2);
		senpai1.setPassword("123456");
		User senpai3 = new User(3,"Ahmet","Salih","123456","hatali");		
		User senpai4 = new User(4,"A","Salih","123456","hatal@gmail.com");		
		User senpai5 = new User(5,"Ahmet","S","123456","hatal@gmail.com");		
		User senpai6 = new User(6,"Ahmet","Salih","123","aha@gmail.com");
	
	    hey.register(senpai3);
	    hey.register(senpai4);
	    hey.register(senpai5);
	    hey.register(senpai6);
	    System.out.println("---------------------");
		hey.register(senpai);
		System.out.println("---------------------");
		hey.register(senpai1);
		System.out.println("---------------------");
		hey.login(senpai.getPassword(),senpai.getEmail() );
		
		
	    
		
	}

}
