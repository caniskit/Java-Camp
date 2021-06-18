package hw2.business;

import hw2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users=new ArrayList<>();



    public List<User> getList() {
        return users;
    }


    public void add(User user) {
        users.add(user);
        System.out.println("User Added :" +user.getName());
    }


    public void update(User user) {
        for(User useritem: users){
            if(useritem.getId()==user.getId()) {
                useritem = user;
                System.out.println("User is updated");
            }else System.out.println("Cannot find any fitted user to update.");
        }
    }


    public void delete(User user) {
        if(users.contains(user))
        users.remove(users);
        else
            System.out.println("User cannot found");

    }
}
