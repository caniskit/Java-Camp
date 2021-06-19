package abstracts;

import entity.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
