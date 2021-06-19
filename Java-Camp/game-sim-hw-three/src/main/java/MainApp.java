import adapters.MernisCheckSerivce;
import business.CampaignManager;
import business.CartManager;
import business.CustomerManager;
import business.GameManager;
import entity.*;

import java.util.Date;

public class MainApp {
    public static void main(String [] args){

        CustomerManager customerManager=new CustomerManager(new MernisCheckSerivce());
        Customer customer1=new Customer(1,"can","iskit",new Date(),"caniskit@gmail.com","1234","12345678901");
        customerManager.add(customer1);
        Game game1=new Game(1,"Satisfactory",50.0,15,true,new Date(2018,01,01));
        GameManager gameManager =new GameManager();
        gameManager.add(game1);
        Campaign campaign1=new Campaign(1,"Summer Discount",15);

        CartManager cartManager =new CartManager();
        cartManager.addToCart(customer1,new CartItem(game1,campaign1,1));

    }
}
