package eStore.core.adapter;

import eStore.googleUser.GoogleLogin;

public class GoogleLoginAdapter implements LoginService {
	
	GoogleLogin google = new GoogleLogin();

	@Override
	public void login(String password, String email) {
		
		
		google.check(password,email);
	}

}
