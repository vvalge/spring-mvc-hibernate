package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void create(User user);

    void update(User user);

    void delete(int id);

    List<User> getUserList();

    User getUserById(int id);

}
