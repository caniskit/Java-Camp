package dataAccess.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductDao {

    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
    public Product get(int id);
    public List<Product> getAll();

}
