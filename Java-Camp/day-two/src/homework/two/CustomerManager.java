package homework.two;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements ICustomerManager{

    List<Customer> customers =new ArrayList<>();
    @Override
    public List<Customer> getAll() {

        return this.customers;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public Customer findById(int id) {
        for(Customer customer : customers)
            if(customer.id==id)
            return customer;
            return null;
    }
}
