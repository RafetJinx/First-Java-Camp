package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        if(customer.getDateOfBrith().getYear() % 2 == 0){
            return true;
        }
        return false;
    }
}
