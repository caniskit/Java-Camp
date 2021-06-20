package core;

import entities.concretes.User;

public interface SignUpService {
    public String signUp(User user);
    public boolean login(String mail,String password);


}
