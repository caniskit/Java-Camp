import homework.two.City;
import homework.two.Customer;
import homework.two.CustomerManager;
import oop.intro.Product;
import oop.intro.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class dayTwoApp {

    public static void main (String[] args) {

    /*    Product product1 =new Product();
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice=15000;
        product1.detail="16 GB Ram";
Product product2 =new Product();
        product2.id=1;
        product2.name="Lenovo V15";
        product2.unitPrice=16000;
        product2.detail="32 GB Ram";
Product product3 =new Product();
        product3.id=1;
        product3.name="HP Envy";
        product3.unitPrice=10000;
        product3.detail="8 GB Ram";

        ProductManager productManager =new ProductManager();

        productManager.addCToart(product1);
        productManager.addCToart(product2);
        productManager.addCToart(product3);*/

        CustomerManager customerManager = new CustomerManager();

        customerManager.add(new Customer(1,"Osman Can","ISKIT",28,new City(1,"TUR","Istanbul"),true));
        customerManager.add(new Customer(2,"Gizem","Değirmenci",23,new City(1,"TUR","Istanbul"),true));
        customerManager.add(new Customer(3,"Meriç","Çoban",22,new City(3,"TUR","Tekirdag"),true));
        customerManager.add(new Customer(4,"Alperen","Turan",24,new City(2,"TUR","Ankara"),false));

        List<Customer> customers=customerManager.getAll();
        for (Customer customer:customers)
            System.out.println(customer.toString());



    }
}
