package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateJPAUserDao implements UserDao {

    private List<User> users =new ArrayList<>();





    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Added with Hibernate JPA : "+user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Updated with Hibernate JPA : "+user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted Hibernate JPA : "+user.getEmail());
    }

    @Override
    public User get(int id) {
        for(User user:users)
        {
            if(user.getId()==id)
                return user;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
