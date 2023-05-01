package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    void update(User updatedUser);

    void delete(int id);

    List<User> getUserList();

    User getUserById(int id);
}
