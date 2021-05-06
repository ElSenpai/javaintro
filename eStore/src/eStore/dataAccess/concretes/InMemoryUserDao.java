package eStore.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eStore.dataAccess.abstracts.UserDao;
import eStore.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	ArrayList<User> users=new ArrayList<User>();
  	 
	@Override
	public void add(User user) {
		
		
		System.out.println("InMemorye Kullan�c� eklendi");
		this.users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println("InMemorye Kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("InMemorye Kullan�c� silindi");
		
	}

	@Override
	public User get(int id) {
		
		User result=null;
		
		for (User user : users) {
			
			if(user.getId()==id)
				result=user;
			
		}
		return result;
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
