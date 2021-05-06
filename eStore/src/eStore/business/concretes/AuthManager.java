package eStore.business.concretes;

import java.util.Scanner;

import eStore.business.abstracts.AuthService;

import eStore.core.adapter.LoggerService;
import eStore.core.adapter.LoginService;

import eStore.dataAccess.abstracts.UserDao;
import eStore.entities.concretes.User;


public class AuthManager implements AuthService {

	private UserDao userdao;
	private LoginService loginServe;
	private LoggerService logger;
	

	public AuthManager(UserDao userdao,LoginService loginServe,LoggerService logger) {
		super();
		this.userdao = userdao;
		this.loginServe=loginServe;
		this.logger=logger;
		
	}

	@Override
	public void login(String password, String email) {
		
		if(this.checkPass(password)&& this.checkEmail(email)) {
			this.loginServe.login(password, email);
			return;
		}
		
		System.out.println("Login baþarýsýz " );
	}

	@Override
	public void register(User user) {
         if(this.rules(user)) {
			
			logger.log("Doðrulama kodu :"+ 356);
		Scanner hey=new Scanner(System.in);
		System.out.println("Kod :"  );
		 hey.nextLine();  
			System.out.println("Kayýt gerçekleþti : " +user.getFirstName());
			
			this.userdao.add(user);
			
		}else
			System.out.println("Geçersiz");
		
		
		
	}
	
	@Override
	public User get(int id) {
		
		
		
		return this.userdao.get(id);
	}
	
	
	
	private boolean rules(User user) {
		
		String regex =  "^(.+)@(.+).(\\.com)$";
	
		
            if(!(user.getFirstName().length()>2)) {
            	System.out.println("First Name 2 karakterden büyük olmalý");
            	return false;}
            	
               
            else if(!(user.getLastName().length()>2)) {
            	System.out.println("LastName 2 karakterden büyük olmalý");
            	return false;
            }
            else if(!(user.getPassword().length()>5)) {
            	System.out.println("Þifre 6 karakterden büyük olmalý");
            	return false;
            }else if(!(user.getEmail().matches(regex))) {
            	System.out.println("Hatalý Mail user@user.com þeklinde olmalý");
            	return false;
            }else if(this.checkEmail(user.getEmail())) {
            	System.out.println("BU kullanýcý mevcut");
            	return false;
            }
            	
            	
		
		return true;
		
		
		
	}
	private boolean checkEmail(String email) {
		
		var results=this.userdao.getAll();
		for (User user : results) {
			if(user.getEmail()==email) {
				return true;
			}
		}
		return false;
	}
   private boolean checkPass(String password) {
		
		var results=this.userdao.getAll();
		for (User user : results) {
			if(user.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	

}
