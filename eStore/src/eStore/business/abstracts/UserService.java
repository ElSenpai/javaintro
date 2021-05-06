package eStore.business.abstracts;

import java.util.List;

import eStore.entities.concretes.User;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
}
