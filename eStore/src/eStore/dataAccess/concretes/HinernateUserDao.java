package eStore.dataAccess.concretes;

import java.util.List;

import eStore.dataAccess.abstracts.UserDao;
import eStore.entities.concretes.User;

public class HinernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hinernate Kullanýcý eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hinernate Kullanýcý güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hinernate Kullanýcý silindi");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
