import abstracts.BaseCustomerManager;
import adapters.MernisCheckService;
import concrete.StarbucksCustomerManager;
import entity.Customer;

import java.util.Date;

public class App {
    public static void main(String [] args){
        BaseCustomerManager manager =new StarbucksCustomerManager(new MernisCheckService());
        manager.save(new Customer(1,"Firstname","Lastname",new Date(1999,6,18),"12345678901"));
    }
}
