package jGoogleAuth;

import java.net.http.HttpResponse;

public class JGoogleAuthManager {

    public String signUp (String mail, String password){

        if(mail !=null && password!=null  ){
        System.out.println("Signed up with google account mail: "+ mail);
        return "{ \"name\": \"test\", \"surname\" : \"user\", \"mail\": \""+mail+"\", \"password\": \""+password +"\"}";
        }else {System.out.println("Auth failed.");
            return "{}";
    }}
    public boolean login(String mail, String password){
        if(!(mail.isBlank() && password.isBlank())){
            System.out.println("Google login success. "+mail);
            return true;
        }
        System.out.println("Google login failed.");
        return false;
    }
}
