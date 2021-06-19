package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;


public class ProductManager implements ProductService {
    private LoggerService loggerService;
    private ProductDao productDao;
    public ProductManager(ProductDao productDao,LoggerService loggerService){
        this.productDao=productDao;
        this.loggerService=loggerService;
    }
    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("This category doesn't allow new products");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("\nProduct Added. "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
