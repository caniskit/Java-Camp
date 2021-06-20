package business.concretes;

import business.abstracts.UserService;
import core.SignUpService;
import core.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private UserDao userDao;
    private ValidationService validationService;


    public UserManager(UserDao userDao,ValidationService validationService){
        this.userDao=userDao;
        this.validationService=validationService;
        init();

    }
    private void init()
    {//initialize test user only once
        if(userDao.getAll().size()==0) {
            userDao.add(new User(1, "Ali", "Demir", "ademir@hotmail.com", "123456"));
            userDao.add(new User(2, "Doğa", "Mutlu", "d.mutlu@test.com", "5462718"));
        }
    }




    @Override
    public void signUp(User user,SignUpService signUpService) {
       if(validateEmail(user.getEmail()))
       {
           if(signUpService!=null){
            String response;
            response=signUpService.signUp(user);
            if(response!="{}"){

                userDao.add(user);
                validationService.send(user);
            }else
                System.out.println("Sign up failed with service");
        }else
        {
            if( user.getFirstName().length()>2 && user.getLastName().length()>2 && user.getPassword().length()>5)
            {
                userDao.add(user);
                validationService.send(user);
            }else
                System.out.println("Please check your inputs.");
        }}

    }

    @Override
    public void login(String mail,String password, SignUpService signUpService) {
        if(signUpService!=null){
            boolean response;
            response=signUpService.login(mail,password);
            if(response)
            { //This code segment for simulation.
                for(User user:this.userDao.getAll()) {
                    if (user.getEmail() == mail && user.getPassword() == password) {
                        if (!(user.isValid())) {
                            validationService.verify(user);
                        }

                        System.out.println("Sign in with google :" + mail);
                    }
                }
            }else
                System.out.println("Sign in failed.");

        }else
            for(User user:userDao.getAll())
            {
                if(user.getEmail()==mail && user.getPassword()==password)
                {
                    if(!(user.isValid()))
                    {
                        validationService.verify(user);
                    }

                    System.out.println("Login Success. "+ user.getFirstName()+" "+user.getLastName());
                    return;
                }
            }System.out.println("Login failed please check your password or email");

    }


    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    private boolean validateEmail(String mail){
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        for (User user : userDao.getAll()){
            if(user.getEmail()==mail)
            {
                System.out.println("This mail already been use.");
                return false;
            }}

            Matcher matcher= pattern.matcher(mail);
                if (matcher.matches())
                    return true;
                else
                    System.out.println("Pattern doesn't fit.");


        return false;
    }
}
