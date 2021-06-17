package homework.two;

import java.util.List;

public interface ICustomerManager {
    public List<Customer> getAll();
    public void add(Customer customer);
    public void delete(Customer customer);
    public Customer findById(int id);
    }

