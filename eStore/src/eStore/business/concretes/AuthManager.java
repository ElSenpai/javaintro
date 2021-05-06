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
		
		System.out.println("Login ba�ar�s�z " );
	}

	@Override
	public void register(User user) {
         if(this.rules(user)) {
			
			logger.log("Do�rulama kodu :"+ 356);
		Scanner hey=new Scanner(System.in);
		System.out.println("Kod :"  );
		 hey.nextLine();  
			System.out.println("Kay�t ger�ekle�ti : " +user.getFirstName());
			
			this.userdao.add(user);
			
		}else
			System.out.println("Ge�ersiz");
		
		
		
	}
	
	@Override
	public User get(int id) {
		
		
		
		return this.userdao.get(id);
	}
	
	
	
	private boolean rules(User user) {
		
		String regex =  "^(.+)@(.+).(\\.com)$";
	
		
            if(!(user.getFirstName().length()>2)) {
            	System.out.println("First Name 2 karakterden b�y�k olmal�");
            	return false;}
            	
               
            else if(!(user.getLastName().length()>2)) {
            	System.out.println("LastName 2 karakterden b�y�k olmal�");
            	return false;
            }
            else if(!(user.getPassword().length()>5)) {
            	System.out.println("�ifre 6 karakterden b�y�k olmal�");
            	return false;
            }else if(!(user.getEmail().matches(regex))) {
            	System.out.println("Hatal� Mail user@user.com �eklinde olmal�");
            	return false;
            }else if(this.checkEmail(user.getEmail())) {
            	System.out.println("BU kullan�c� mevcut");
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
