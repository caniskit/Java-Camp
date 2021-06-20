package core;

import entities.concretes.User;

public class MailValidationManager implements ValidationService{

    @Override
    public void send(User user) {
        System.out.println("Mail is send. Please Check your mailbox. Mail: "+user.getEmail());
    }

    @Override
    public boolean verify(User user) {
        System.out.println(user.getEmail()+" is verified. You can access.");
        return true;
    }
}
