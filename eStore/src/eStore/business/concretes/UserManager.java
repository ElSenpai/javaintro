package eStore.business.concretes;

import java.util.List;


import eStore.business.abstracts.UserService;
import eStore.dataAccess.abstracts.UserDao;
import eStore.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userdao;
	
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public void add(User user) {
		
		userdao.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
      


}
