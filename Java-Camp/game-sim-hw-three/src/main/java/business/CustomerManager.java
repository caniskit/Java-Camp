package business;

import abstracts.ICustomerCheckService;
import abstracts.ICustomerService;
import entity.Customer;

public class CustomerManager implements ICustomerService {
    private ICustomerCheckService customerCheckService;

    public CustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    //List<Customer> getAll();
    //Customer getById(int id);
    @Override
    public void add(Customer customer) {
    if(customerCheckService.checkIfRealPerson(customer)){
        System.out.println("Customer added success. "+customer.getFirstName());
    }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer data Updated. "+customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer is deleted. "+customer.getLastName());
    }
}
