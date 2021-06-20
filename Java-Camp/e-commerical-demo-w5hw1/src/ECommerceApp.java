import business.concretes.UserManager;
import core.JGoogleAuthManagerAdapter;
import core.MailValidationManager;
import dataAccess.concretes.HibernateJPAUserDao;
import entities.concretes.User;

public class ECommerceApp {

    public static void main(String [] args){
        UserManager userManager =new UserManager(new HibernateJPAUserDao(),new MailValidationManager());

        userManager.signUp(new User(3,"Kerem","Gönüllü","krms@gmail.com","123456"),null);
        userManager.signUp(new User(3,"Kerem","Turan","krms@gmail.com","123456"),null);
        userManager.signUp(new User(4,"Ali","Serezli","a.serezli@gmail.com","458126"),new JGoogleAuthManagerAdapter());
        userManager.signUp(new User(5,"Osman","iskit","caniskit@gmail.com","9874556"),null);
        userManager.login("caniskit@gmail.com","9874556",new JGoogleAuthManagerAdapter());
        userManager.login("ademir@hotmail.com","123456",null);
        userManager.login("a.serezli@gmail.com","5",null);
    }
}
