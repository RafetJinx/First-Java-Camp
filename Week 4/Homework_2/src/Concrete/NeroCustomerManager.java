package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else {
            throw new RuntimeException();
        }
    }
}
