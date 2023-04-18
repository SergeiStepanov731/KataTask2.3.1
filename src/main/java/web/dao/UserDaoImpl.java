package web.dao;


import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);

        return query.getResultList();
    }

    @Override
    public void saveUser(User user) {

        entityManager.persist(user);

    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(int id, User user) {

        User user1 = getUser(id);
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setDepartment(user.getDepartment());
        user1.setSalary(user.getSalary());
        entityManager.merge(user1);
    }

    @Override
    public void delete(int id) {

        User user2 = entityManager.find(User.class, id);
        entityManager.remove(user2);
    }
}
