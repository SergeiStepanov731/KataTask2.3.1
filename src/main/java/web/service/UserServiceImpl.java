package web.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.entity.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
       return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
