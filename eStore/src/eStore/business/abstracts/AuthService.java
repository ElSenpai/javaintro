package eStore.business.abstracts;

import eStore.entities.concretes.User;

public interface AuthService {

	void login(String password,String email);
	void register(User user);
	User get(int id);
	
}
