package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager (CustomerCheckService customerCheckService){
        this.customerCheckService=customerCheckService;
    }
    @Override
    public void save(Customer customer){
        if(customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Check success.");
            super.save(customer);
        }  else
            System.out.println("Not a valid person.");
    }
}
