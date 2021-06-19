import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {
    public static void main(String [] args){
        //To Do Resolve with Spring IoC
        ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

        productService.add(new Product(1,1,"Apple",12,50));
        productService.add(new Product(2,2,"Orange",10,90));

    }
}
