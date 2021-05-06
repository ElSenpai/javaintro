package eStore.dataAccess.abstracts;

import java.util.List;

import eStore.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete (User user);
	User get(int id);
	List<User>getAll();
	

}
