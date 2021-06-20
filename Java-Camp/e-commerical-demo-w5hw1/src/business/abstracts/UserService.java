package business.abstracts;


import core.SignUpService;
import entities.concretes.User;
import java.util.List;

public interface UserService {

    void signUp(User user,SignUpService signUpService);
    void login(String mail,String password,SignUpService signUpService);
    List<User> getAll();

}
