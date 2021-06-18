package hw2.business;

import hw2.entity.User;

public class StudentManager extends UserManager{
    @Override
    public void add(User user) {
        super.add(user);
        System.out.println("Student added . "+user.getName());
    }
}
