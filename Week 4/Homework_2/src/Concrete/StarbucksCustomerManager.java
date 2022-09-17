package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    // Dependency Injection
    private CustomerCheckService customerCheckService;
    @Override
    public void save(Customer customer) {
        try {
            if(customerCheckService.checkIfRealPerson(customer)){
                super.save(customer);
            }
        } catch (Exception e) {
            System.out.println("Not a valid person!");
        }
    }


}
