package web.dao;

import web.entity.User;
import java.util.List;

public interface UserDao {

    void update(int id, User user);

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void delete(int id);
}
