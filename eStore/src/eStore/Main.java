package eStore;



import java.util.Scanner;

import eStore.business.abstracts.AuthService;
import eStore.business.concretes.AuthManager;
import eStore.core.adapter.EmailLogger;
import eStore.core.adapter.GoogleLoginAdapter;
import eStore.dataAccess.concretes.InMemoryUserDao;
import eStore.entities.concretes.User;


public class Main {
static Scanner yoo=new Scanner(System.in);	
	  static AuthService authService=new AuthManager(new InMemoryUserDao(),new GoogleLoginAdapter(),new EmailLogger());
	public static void main(String[] args) {
		
		tested();
		tested2();
		
		
	    
		
	}

	private static void tested() {
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
	
	private static void tested2() {	
		int number;
		System.out.println("    ********Operations********\n"
				+"\n"+ "          1 Register\n"
				+ "          2 Register With Google\n"
				+ "          3 Login\n");
		System.out.println("Decide to Operation ;");
		while (true) {
			
			number=yoo.nextInt();
			switch(number) {
			case 1:
				register();
				break;
			case 2:
				googleRegister();
				break;
			case 3:
				login();
				break;
			
			}
			
		}
		
	}
	private static void register() {
		yoo.nextLine();
		
		System.out.println("Press FirstName : ");
		String firstName=yoo.nextLine();
		System.out.println("Press LasttName : ");
		String lastName=yoo.nextLine();
		System.out.println("Press Email : ");
		String email=yoo.nextLine();
		System.out.println("Press Password : ");
		String password=yoo.nextLine();
		User user =new User(1,firstName,lastName,password,email);
		authService.register(user);
	}
	private static void login() {
		
	}
	private static void googleRegister() {
		
	}
	

}
