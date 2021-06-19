package abstracts;

import entity.Customer;

public interface ICustomerService{
    public void add(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
}
