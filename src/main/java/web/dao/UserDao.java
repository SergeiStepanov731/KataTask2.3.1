package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    public void update(int id, User user);


    public List<User> getAllUsers();

   public void saveUser(User user);

   public User getUser(int id);

   public void delete(int id);
}
