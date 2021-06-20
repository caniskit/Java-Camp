package core;

import entities.concretes.User;
import jGoogleAuth.JGoogleAuthManager;

public class JGoogleAuthManagerAdapter implements SignUpService{

    @Override
    public String signUp(User user) {
        String response;
        JGoogleAuthManager jGoogleAuthManager=new JGoogleAuthManager();
        response= jGoogleAuthManager.signUp(user.getEmail(),user.getPassword());
        return response;
    }

    @Override
    public boolean login(String mail, String password) {

        JGoogleAuthManager jGoogleAuthManager=new JGoogleAuthManager();

        return jGoogleAuthManager.login(mail,password);
    }
}
