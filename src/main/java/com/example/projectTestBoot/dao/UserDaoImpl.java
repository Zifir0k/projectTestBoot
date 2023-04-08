package com.example.projectTestBoot.dao;

import com.example.projectTestBoot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserId(long id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public void removeUser(long id) {
        entityManager.remove(getUserId(id));

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}
